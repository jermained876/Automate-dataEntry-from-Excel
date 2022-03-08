package file;

import org.apache.poi.ss.usermodel.Sheet;

public class data {

	


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return FirstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return LastName;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return JobTitle;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return Level;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return Sex;
	}

	/**
	 * @return the year
	 */
	public String getYear() {
		return Year;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return Date;
	}

	private String FirstName;
	private String LastName;
	private String JobTitle;
	private String Level;
	private String Sex;
	private String Year;
	private String Date;
	
	public data(Sheet sheet, int row) {
		
		
		
		
		
		
		
		setFirstName(sheet, row);
		setLastName(sheet, row);
		setJobTitle(sheet, row);
		setLevel(sheet, row);
		setSex(sheet, row);
		setYear(sheet, row);
		setDate(sheet, row);
		
	}

	private void setDate(Sheet sheet, int row) {
		try {
			
		this.Date =sheet.getRow(row).getCell(7).toString();
		}
		catch(Exception e)
		{
			this.Date ="20201010";
		}
	}

	private void setYear(Sheet sheet, int row) {
		
	//	System.out.println(sheet.getRow(row).getCell(6).toString());
		
		try {
		this.Year =sheet.getRow(row).getCell(6).toString();
		}
		catch(Exception e)
		{
			this.Year ="0-1";
		}
		
	}

	private void setSex(Sheet sheet, int row) {
		
		try {
		this.Sex =sheet.getRow(row).getCell(5).toString();
		}
		catch(Exception e)
		{
			this.Sex ="Prefer not to say";
		}
		
	}

	private void setLevel(Sheet sheet, int row) {
		
	//	System.out.println(sheet.getRow(row).getCell(4).toString());
		
		try {
		this.Level =sheet.getRow(row).getCell(4).toString();
		}
		catch(Exception e)
		{
			this.Level ="High School";
		}
	}

	private void setLastName(Sheet sheet, int row) {
		try {
		this.LastName =sheet.getRow(row).getCell(2).toString();
		}
		catch(Exception e)
		{
			this.LastName ="Doe";
		}
		
	}

	private void setJobTitle(Sheet sheet, int row) {
		try {
			
		this.JobTitle =sheet.getRow(row).getCell(3).toString();
		}
		catch(Exception e)
		{
			this.JobTitle ="20201010";
		}
	}

	private void setFirstName(Sheet sheet, int row) {
		try {
		this.FirstName =sheet.getRow(row).getCell(1).toString();
		}
		catch(Exception e)
		{
			this.FirstName ="John";
		}
		
		
		
	}

}
