package oopsConcept;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandlingExcel
{

	public static void printtable12()
	{
		int n=10;
		for(int i=1; i<11;i++)
		{
			System.out.println(n*i);
		}
	}
	
	public static void readexcel() throws Exception
	{
		File f = new File("C:\\TestData\\xyz.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("data1");
		
		int nr = sh1.getPhysicalNumberOfRows();  //2
		System.out.println(nr);
		
		for(int i = 0; i<nr; i++)
		{
			XSSFRow row = sh1.getRow(i);  //i=0
			
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j = 0; j<nc; j++)
			{
				XSSFCell col = row.getCell(j);  //first column
				
				System.out.print(col.getStringCellValue() + "      ");
			}
			
			System.out.println();
			
			}

			
		
		
		
		
		
		
		
		/*
		 
		XSSFRow row1 = sh1.getRow(0);  //firstrow

		XSSFCell col1 = row1.getCell(0);  //first column
		
		System.out.print(col1.getStringCellValue() + "      ");
		
		XSSFCell col2 = row1.getCell(1);  //first column
		
		System.out.println(col2.getStringCellValue());
		
		
		//second row
		
		XSSFRow row2 = sh1.getRow(1);  //second row
		
		XSSFCell col21 = row2.getCell(0);  //first column
		
		System.out.print(col21.getStringCellValue() + "   ");
		
		XSSFCell col22 = row2.getCell(1);  //first column
		
		System.out.println(col22.getStringCellValue());
		
		*/
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		printtable12();
	}
	
}
