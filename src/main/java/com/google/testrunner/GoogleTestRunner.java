package com.google.testrunner;

import com.google.threadclass.GoogleFeatureThread;

public class GoogleTestRunner {

	public static void main(String[] args) {

//		Thread t1 = new GoogleFeatureThread("google thread", "chrome");
//		Thread t2 = new GoogleFeatureThread("firefox thread", "firefox");
//		
//		t1.start();
//		t2.start();

		int chromeCount = Integer.parseInt(System.getProperty("chrome"));
		int firefoxCount = Integer.parseInt(System.getProperty("firefox"));

		System.out.println("total chrome count: " + chromeCount);

		for (int i = 0; i < chromeCount; i++) {
			System.out.println("thread started...");
			new GoogleFeatureThread("google thread", "chrome").start();
			System.out.println("thread ended...");
		}

		System.out.println("total firefox count: " + firefoxCount);
		for (int i = 0; i < firefoxCount; i++) {
			System.out.println("thread started...");
			new GoogleFeatureThread("firefox thread", "firefox").start();
			System.out.println("thread ended...");
		}

	}

}
