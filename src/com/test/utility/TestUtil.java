package com.test.utility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtil {
	static FileInputStream fis;
	static Workbook wb;
	static Sheet s;
	static Row r;
	
	public static void getDataFromExcel(){
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try
		{
			fis=new FileInputStream("");
			wb= WorkbookFactory.create(fis);
			s=wb.getSheet("");
			
		}
		catch(Exception e)
		{
			
		}
		for(int rownum=1;rownum<=s.getLastRowNum();rownum++)
		{
			r=s.getRow(rownum);
			for(int colnum=0;colnum<=r.getLastCellNum();colnum++)
			{
				String 
			}
		
		}
		
		
		
		
		
		
		
		
		
	}

}
