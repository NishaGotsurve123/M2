package CommonUtils;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class ListenerImplementation implements ITestListener{
	
	ExtentReports report ;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	//System.out.println("Testscript excution is started");
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"Testscript excution is started",true);
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript excution is Passed");
		String methodName = result.getMethod().getMethodName();
		//Reporter.log(methodName+"Testscript excution is Passed",true);
		Test.
	
	
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript excution is failed");	
		String message = result.getThrowable().toString();
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"Testscript excution is failed"+message,true);
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("Testscript excution is skippe");
		String methodName = result.getMethod().getMethodName();
		Reporter.log(methodName+"Testscript excution is skipped",true);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		//System.out.println("To start the execution");
		Reporter.log("To start the execution",true);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//System.out.println("To finish the execution");
		Reporter.log("To finish the execution",true);
		
	}
	
	
	public void onStart(ITestContext context) {
	 
		// System.out.ptintln("To start Execution");
	   // Reporter.log("Execution is started", "True");	
		// Create the object of ExtentSparkReport class
		ExtentSparkReporter report = new ExtentSparkReporter("./extentreport/report.html");
	
	report  = new ExtentReport();
	report.attachReporter(report);
	report.setSystemInfo("Os", "Window");
	report.setSystemInfo("Browser","Chrome");
	report.setSystemInfo("ChromeVersion", "121");
	report.setSystemInfo("Author", "Pune");

	}

   public void onFinish(ItContext cntext) {
	   
	   // 
	   report.flush();
	   
   }
