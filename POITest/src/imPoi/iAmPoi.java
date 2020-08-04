package imPoi;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class iAmPoi{
//	public static void main(String[] args) {
	public String[][] excelIt(String EXCEL_FILE_PATH,int a,int b) throws IOException, InvalidFormatException, InterruptedException {
		
		{
			InputStream inp=null;
			String[][] u=new String[a][b]; // String[rows][cols]
			try {
			        inp = new FileInputStream(EXCEL_FILE_PATH);  // Create new File input stream based on excel
			        
			        Workbook wb = WorkbookFactory.create(inp);  // Create workbook
			        Sheet sheet2 = wb.getSheetAt(0);  //Create sheet and access first page
//					        Header header = (Header) sheet.getHeader();
	             int rowsCount = sheet2.getLastRowNum(); // Access number of rows in sheet
			        System.out.println("Total Number of Rows: " + (rowsCount + 1));
			          
			        for (int i = 0; i <= rowsCount; i++) {//try rowsCount-2 to get rid off java error
			            org.apache.poi.ss.usermodel.Row row = sheet2.getRow(i);
			            int colCounts = row.getLastCellNum();
			            System.out.println("Total Number of Cols: " + colCounts);
			              for (int j = 0; j < colCounts; j++) {
			                  org.apache.poi.ss.usermodel.Cell cell = row.getCell(j);
			                  System.out.println("[" + i + "," + j + "]="+"***" );//+ cell.getStringCellValue());
			                 u[i][j]=cell.getStringCellValue();
			             }//System.out.println(v[select][1]);
			                
			          }

			        } catch (Exception ex) {
//					            java.util.logging.Logger.getLogger(FieldController.class.getName()).log(Level.SEVERE, null, ex);
			        	ex.printStackTrace();
			        } finally {
			            try {
			                inp.close();
			            } catch (IOException ex) {
//					                java.util.logging.Logger.getLogger(FieldController.class.getName()).log(Level.SEVERE, null, ex);
			            	ex.printStackTrace();
			            }
			        }
			inp.close();
			return u;
}}}


