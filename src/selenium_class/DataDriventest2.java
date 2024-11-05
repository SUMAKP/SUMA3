package selenium_class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriventest2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		 Workbook book1 = WorkbookFactory.create(fis);
		Sheet sheet = book1.createSheet("3hjheet");
		 Row rw = sheet.createRow(0);
		Cell c1 = rw.createCell(0);
		c1.setCellValue("suma prabhakar");
	
	FileOutputStream fos=new FileOutputStream("./Excel/TestData.xlsx");
	book1.write(fos);
	}

}
