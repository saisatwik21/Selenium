package keywordframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calling {
//	static WebDriver d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		methods m = new methods();
		FileInputStream f1=new FileInputStream("C:/Chakradhar/Book3.xlsx");
		XSSFWorkbook wb =  new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Sheet7");
		Row r;
		Cell c;
		Iterator<Row> row = ws.iterator();
		r=ws.getRow(2);
		while(row.hasNext()) {
			r=row.next();
			c=r.getCell(2);
			String val = c.getStringCellValue();
			if(val.equals("Opening_browser"))
				m.open_browser();
			else if(val.equals("Navigate")) 
				m.Navigate();
			else if(val.equals("usernameenter"))
				m.usernameenter();
			else if(val.equals("passwordenter"))
				m.passwordenter();
			else if(val.equals("click"))
				m.click();
			else
				m.close();
		}

	}

}
