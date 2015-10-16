/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poiobj;

import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * @author Administrator
 */
public class CreateDateCells {
    public static void main(String args[]) throws Exception
    {
        Workbook wb = new HSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("new sheet");
        
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        cell.setCellValue(new Date());
        
        // we style the second cell as a date (and time).  It is important to
        // create a new cell style from the workbook otherwise you can end up
        // modifying the built in style and effecting not only this cell but other cells.
        //我们设计第二个单元格作为一个date(and time).建立一个工作薄的新单元格样式是很重要的，
        //你可以以修改内置的风格结束，不仅影响这个也会影响其他的单元格。
        CellStyle cellstyle = wb.createCellStyle();
        cellstyle.setDataFormat(createHelper.createDataFormat().getFormat("m/d/yy h:mm"));
        cell = row.createCell(1);
        cell.setCellValue(new Date());
        cell.setCellStyle(cellstyle);///////////////////////////////////////////////////////
        
        cell = row.createCell(2);
        cell.setCellValue(Calendar.getInstance());
        cell.setCellStyle(cellstyle);//////////////////////////////////////////////////////
        
        FileOutputStream fileout = new FileOutputStream("D://java源程序/workbook2.xls");
        wb.write(fileout);
        fileout.close();
        
        
    }
    
}
