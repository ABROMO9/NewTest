package datadriven;

public class ExcelRead {
	
	// URL to get the binary http://poi.apache.org/download.html
	// Binary Name poi-bin-3.11-beta2-20140822.zip
	// Extract the binary
	// Add all the jars from the location you extracted to the build path
	// Also add all the jars from lib, do not add the jar file of log4j
	// Also add all the jars from ooxml-lib
	// Only works for Excel 2007+
	
	public static void main(String [] args) {
		// Location of the Excel file
		String path = "C:\\Users\\abromo\\eclipse-workspace\\TestNGTutorial\\src\\datadriven\\ExcelRead.xlsx";
		String sheetName = "Sheet1";
		
		try {
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
