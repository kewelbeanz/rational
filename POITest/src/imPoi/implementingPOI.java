package imPoi;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import imPoi.iAmPoi;
public class implementingPOI {
	public static final String EXCEL_FILE_PATH="";
	
	public static void main(String[] args) throws InvalidFormatException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		// Create double array variable q to hold excel file contents
				String [][] q=null;
				// Instantiate the POI class
				iAmPoi p=new iAmPoi();
				// Store the excel values in the double array variable q, using class excelIt 
				q=p.excelIt(EXCEL_FILE_PATH,7,3);
				// Then can use the contents of q, stored as e.g., q[2][1] to access excel string values and input later
	}

}
