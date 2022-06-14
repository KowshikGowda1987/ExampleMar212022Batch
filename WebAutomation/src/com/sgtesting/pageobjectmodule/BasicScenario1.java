package com.sgtesting.pageobjectmodule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser();
		DeleteUser();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			oPage.getuser().click();
			oPage.getadduser().click();
			oPage.getfirstName().sendKeys("test");
			Thread.sleep(1000);
			oPage.getlastName().sendKeys("case1");
			Thread.sleep(1000);
			oPage.getemail().sendKeys("testcase1@gmail.com");
			Thread.sleep(1000);
			oPage.getusername().sendKeys("TestCase1");
			Thread.sleep(1000);
			oPage.getpwd().sendKeys("TestCase1");
			Thread.sleep(1000);
			oPage.getpasswordCopy().sendKeys("TestCase1");
			Thread.sleep(1000);
			oPage.getcreateuser().click();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try {
			oPage.getuser2().click();
			Thread.sleep(1000);
			oPage.getusernameclick1().click();
			Thread.sleep(1000);
			oPage.getdeleteuser().click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
