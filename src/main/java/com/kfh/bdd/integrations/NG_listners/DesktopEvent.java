package com.kfh.bdd.integrations.NG_listners;

import java.io.IOException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.kfh.bdd.ccl.test;
import com.kfh.bdd.integrations.common_utils.DriverFactory;
import com.kfh.bdd.integrations.common_utils.VideoRecord;
import com.kfh.bdd.integrations.report_utils.ReportManager;

import groovyjarjarantlr.collections.List;

public class DesktopEvent implements ITestListener {

//	DriverFactory driverFactory = DriverFactory.getInstance();
	test t = new test();
	@Override
	public void onTestStart(ITestResult arg0) {
		// ReportManager.sstartTest(arg0.getMethod().getMethodName(),
		// arg0.getMethod().getDescription(),
		// ConfigReader.getValue("Execution_Desktop"));
		
		

//		try {
//			t.tasklist();
//			DriverFactory.getInstance().setDesktopDriver();
////			driverFactory.setDesktopDriver();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		// try {
//		// 	t.tasklist();
//		// 	driverFactory.setDesktopDriver();
//		// } catch (Exception e) {
//		// 	e.printStackTrace();
//		// }
//
		try {
	VideoRecord.startRecord(arg0.getName());
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("Test Success: " + iTestResult.getMethod().getMethodName());
		

		ReportManager.logPass("Test case passed");
		ReportManager.endCurrentTest();
		try {
		// DriverFactory.getInstance().getWindowDriver().quit();
		 //getAllSessionDetails();
			t.tasklist();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			VideoRecord.stopRecord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("Test Fail: " + iTestResult.getMethod().getMethodName());
		try {
			ReportManager.logFail(iTestResult.getThrowable().toString());
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ReportManager.endCurrentTest();
		try {
			// DriverFactory.getInstance().getWindowDriver().quit();
			t.tasklist();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			VideoRecord.stopRecord();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		//  DriverFactory.getInstance().getWindowDriver().quit();
		 try {
			t.tasklist();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		}

	}

	@Override
	public void onStart(ITestContext arg0) {
		 try {
		 	t.tasklist();
		 	DriverFactory.getInstance().setDesktopDriver();
		 } catch (Exception e) {
		 	e.printStackTrace();
		 }

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

}
