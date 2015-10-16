/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poiobj;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileOutputStream;
/**
 *
 * @author Administrator
 */
public class CreateCells {
    public static void main(String args[]) throws Exception
    {
        Workbook wb = new HSSFWorkbook();
        CreationHelper createHelper = wb.getCreationHelper();
        Sheet sheet = wb.createSheet("new sheet");
        
        //创建一行，并给它添加一些单元格，行从0开始
        Row row = sheet.createRow((short)0);
        
        //创建一个单元格，并给它添加一个值
        Cell cell = row.createCell(0);
        cell.setCellValue(1);
        
        row.createCell(1).setCellValue(1.2);
        row.createCell(2).setCellValue(createHelper.createRichTextString("this is a string"));
        row.createCell(3).setCellValue(true);
        
        FileOutputStream fileout = new FileOutputStream("D://java源程序/workbook.xls");
        wb.write(fileout);
        fileout.close();
    }
    
}
