package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {

	public void googleSearchTest() {
		driver.findElement(By.name("q")).clear();
		driver.findElement(By.name("q")).sendKeys("naveen automationlabs");
		driver.findElement(By.name("q")).submit();
		
		List<WebElement> hThreeLinks = driver.findElements(By.xpath("//h3"));
		
		for(int i=0; i<hThreeLinks.size(); i++) {
			System.out.println(hThreeLinks.get(i).getText());
		}
	}

	public void tearDown() {
		driver.quit();
	}

}
