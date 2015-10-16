/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poiobj;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
/**
 *
 * @author Administrator
 */
public class NewWorkbook {
    public static void main(String args[])
    {
        try
        {
            Workbook wb = new HSSFWorkbook();
            FileOutputStream fileOut = new FileOutputStream("D://java源程序/workbook.xls");
            wb.write(fileOut);//写出该workbook到一个outputstream
         
            fileOut.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
