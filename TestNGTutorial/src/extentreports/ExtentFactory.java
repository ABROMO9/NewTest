package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	public static ExtentReports getInstance() {
		ExtentReports extent;
		String path = "C:\\Users\\abromo\\Desktop\\report-demo.html";
		extent = new ExtentReports(path, false);
		extent
			.addSystemInfo("Selenium Version", "2.52")
			.addSystemInfo("Platform", "Windows");
			
		return extent;
	}

}
