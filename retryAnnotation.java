package testNGAutomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryAnnotation implements IRetryAnalyzer{

	int a=0;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		while(a<4) {
			a++;
			return true;
		}
		return false;
	}

}
