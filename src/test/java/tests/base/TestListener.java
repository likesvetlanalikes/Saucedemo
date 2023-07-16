package tests.base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult result){
        System.out.printf("Test started: %s \n",result.getName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.printf("Test success: %s \n",result.getName());
    }

    public void onTestFailure(ITestResult result){
        //TODO MAKE Screen
        System.out.printf("Test failure: %s \n",result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext result) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
