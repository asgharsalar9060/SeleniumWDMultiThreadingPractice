package com.google.threadclass;

import com.pages.GooglePage;

public class GoogleFeatureThread extends Thread {

	GooglePage googlePage;
	public String browserName;

	public GoogleFeatureThread(String threadName, String browserName) {
		super(threadName);
		this.browserName = browserName;
		googlePage = new GooglePage();
	}

	@Override
	public void run() {
		System.out.println("thread started..." + Thread.currentThread().getName());

		try {
			googlePage.setUp(this.browserName);
			googlePage.googleSearchTest();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			googlePage.tearDown();
		}

		System.out.println("thread ended..." + Thread.currentThread().getName());
	}

}
