package com.revature.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {

	public static void main(String[] args) throws InterruptedException {
		//location of web driver
		System.setProperty("webdriver.chrome.driver","C:/WebDrivers/Chrome/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080");
		
		
		//Addition
		WebElement addInput1 = driver.findElement(By.id("addNum1"));
		WebElement addInput2 = driver.findElement(By.id("addNum2"));
		WebElement addButton = driver.findElement(By.id("addBtn"));
		
		addInput1.sendKeys("12.5");
		addInput2.sendKeys("10.5");
		addButton.click();
		
		driver.switchTo().frame("addResult");
		WebElement addOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 12 and 10 is "+ addOutput.getText());
		
		driver.switchTo().defaultContent();
		
		//Subtraction
		WebElement subtractInput1 = driver.findElement(By.id("subtractNum1"));
		WebElement subtractInput2 = driver.findElement(By.id("subtractNum2"));
		WebElement subtractButton = driver.findElement(By.id("subtractBtn"));
		
		subtractInput1.sendKeys("12.5");
		subtractInput2.sendKeys("10.5");
		subtractButton.click();
		
		driver.switchTo().frame("subtractResult");
		WebElement subtractOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 12 and 10 is "+ subtractOutput.getText());
		
		driver.switchTo().defaultContent();
		
		//Multiplication
		WebElement multiInput1 = driver.findElement(By.id("multiNum1"));
		WebElement multiInput2 = driver.findElement(By.id("multiNum2"));
		WebElement multiButton = driver.findElement(By.id("multiBtn"));
		
		multiInput1.sendKeys("12.5");
		multiInput2.sendKeys("10.5");
		multiButton.click();
		
		driver.switchTo().frame("multiResult");
		WebElement multiOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 12 and 10 is "+ multiOutput.getText());
		
		driver.switchTo().defaultContent();
		
		
		//Division
		WebElement divideInput1 = driver.findElement(By.id("divideNum1"));
		WebElement divideInput2 = driver.findElement(By.id("divideNum2"));
		WebElement divideButton = driver.findElement(By.id("divideBtn"));
		
		divideInput1.sendKeys("12.5");
		divideInput2.sendKeys("10.5");
		divideButton.click();
		
		driver.switchTo().frame("divideResult");
		WebElement divideOutput = driver.findElement(By.tagName("pre"));
		System.out.println("The result of adding 12 and 10 is "+ divideOutput.getText());
		
		driver.switchTo().defaultContent();
		
		
		
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
