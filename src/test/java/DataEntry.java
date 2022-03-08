import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import component.Form;
import file.access;
import file.data;
import navi.Navigate;

public class DataEntry extends BaseTest {

	access log = new access(); 
	public static Sheet sheet;
	int dataAmount =0;
	
	
	@Test
	public void addData() throws IOException, InterruptedException
	{
		
		// open file
		sheet = log.openFile();
		
		//get file number
		dataAmount = sheet.getPhysicalNumberOfRows();
		
		// close file
		log.closeFile();
		
		// read each data
		if(dataAmount>0)
		{
			for(int i=1; i<dataAmount; i++)
			{
				//open file
				log.openFile();
				
				//System.out.println(sheet.getRow(i).getCell(i));
				data d = new data(sheet,i);
				//navigate to form
						
					//select formy banner
					driver.findElement(By.id("logo")).click();
					Thread.sleep(1000);
					//select Complete Web form
					driver.findElement(By.xpath("//a[text()='Complete Web Form' and @class='btn btn-lg']")).click();
				
					Thread.sleep(1000);
					// update form
					new Form().updateForm(d, driver);
				
				//close file
				log.closeFile();
			  
			}
			
		}
		
		
		//update record 
		
		//reprocess file
		
		
	}
}
