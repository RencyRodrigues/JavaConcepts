package dataHandling;
//
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling {
	
	public static void main(String[] args) throws Exception {
		
	
	//step 1:first way
	String path=System.getProperty("user.dir");//it will locate the location of your project
	System.out.println(path);//it will display the location of project

	
	//2nd way: by hardcoding the path never recommended
	File excel=new File("C:\\Users\\Max\\eclipse-workspace\\zeel java practice\\Data\\Patient Hospital Data.xlsx");
	
	//3rd way:relative path
	String excelpath="\\Data\\Patient Hospital Data.xlsx";
	System.out.println(path+excelpath);
	String excelpath1=path+excelpath;
	System.out.println(excelpath1);

	//Step 2: reading an excel file FileInputStream is used to read the file and FileOutputStream is used to write the file
	FileInputStream read=new FileInputStream(excelpath1);//step 1
	//workbook//worksheet//rows or columns//cells
	XSSFWorkbook wb= new XSSFWorkbook(read);
	XSSFSheet sheet=wb.getSheet("Patient");
	//method 1 : to get the value from the cell 
	int Rows=sheet.getLastRowNum();//gives number of rows present in the table
	System.out.println(Rows);
	
	int Cols=sheet.getRow(0).getLastCellNum();//gives number of columns of 0th row
	System.out.println(Cols);
	
	String value=sheet.getRow(0).getCell(0).getStringCellValue();//it gives value of each cell.
	System.out.println(value);
	
	//method 2: using forloop
	for (int i=0;i<=Rows;i++) {
		XSSFRow row=sheet.getRow(i);
		
		for(int j=0;j<Cols;j++) {
			XSSFCell col=row.getCell(j);
			switch(col.getCellType()){
				case STRING:
					System.out.print(col.getStringCellValue()+"\t"+"\t"+"\t"+"\t");
				
					break;
				case NUMERIC:
					System.out.print(col.getNumericCellValue()+"\t"+"\t"+"\t"+"\t");
					
					break;
					
			 default:
				 System.out.print(col.getRawValue()+"\t"+"\t"+"\t"+"\t");
			}
		}
		System.out.println();
	}
	
}}







