package com.qa.main.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class tetsLoginUtil 
{
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	public static String FilePathforLoginexcel ="C:\\Users\\r.sambhaji.kolate\\workspace\\CRMfreeTest\\src\\main\\java\\com\\main\\qa\\Testdata\\LoginTestwithMultiuser.xlsx";
	public static Object[][] getTestData(String Sheetname)
	//passing sheetname eg : login
	{FileInputStream file = null;
		try {
		file = new FileInputStream(FilePathforLoginexcel);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	// workbook
		try {
			
			// it will retun one workbook class object , create workbook file.
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//  from which sheet we need to fetch the data .eg : Login 
		sheet = book.getSheet(Sheetname);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i=0 ;i<sheet.getLastRowNum() ;i++)
		{
			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
			{
				data[i][k]=sheet.getRow(i+1).getCell(k).toString();
			}
		}
		return data;
		//return data into 2D array.
				
	}

}
