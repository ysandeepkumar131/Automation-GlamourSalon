package utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

import base.BaseTest;

public class SuiteListeners implements ITestListener, IAnnotationTransformer{

	public void onTestFailureITestResult(ITestResult Result)
	
	{
		String filename=System.getProperty("usr.dir")+File.separator+"screenshot"+File.separator+Result.getMethod().getMethodName();
		File file = ((TakesScreenshot)BaseTest.driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file,new File(filename+ ".png"));
		
		try {
			
			FileUtils.copyFile(file,new File(filename+".png"));
				
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	public void transform(
		      ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		    annotation.getRetryAnalyzerClass();
		  }
}

