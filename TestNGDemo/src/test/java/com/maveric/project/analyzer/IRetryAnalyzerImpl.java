package com.maveric.project.analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyzerImpl implements IRetryAnalyzer {

	int retryCounter = 1, maxRetryCounter = 2;

	@Override
	public boolean retry(ITestResult result) {
		System.out.println("Retry Execution := " + result.getName() + " count :- " + retryCounter);
		if (retryCounter <= maxRetryCounter) {
			retryCounter++;
			return true;
		}
		return false;
	}
}
