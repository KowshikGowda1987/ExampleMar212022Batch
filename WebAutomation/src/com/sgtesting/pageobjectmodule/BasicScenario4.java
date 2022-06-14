package com.sgtesting.pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScenario4 {
	public static WebDriver Browser=null;
	public static Actitimepage1 Page=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createcustomer();
		ModifyCustomer();
		DeleteCustomer();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
			Browser=new ChromeDriver();
			Page=new Actitimepage1(Browser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void navigate()
	{
		try
		{
			Browser.get("http://localhost:81/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			Page.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			Page.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void createcustomer()
	{
		try {
			Page.getclicktask().click();
			Thread.sleep(1000);
			Page.getclickadduser().click();
			Thread.sleep(1000);
			Page.getnewcustomer().click();
			Thread.sleep(1000);
			Page.getenternewcustomer().sendKeys("Customer1");
			Thread.sleep(1000);
			Page.getcustomerdescription().sendKeys("Sample customer1");
			Thread.sleep(1000);
			Page.getcreatecustomer().click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void ModifyCustomer() {
		{
			try {
				Page.getclicktask().click();
				Thread.sleep(1000);
				Page.getgearclick().click();
				Thread.sleep(1000);
				Page.getNewCustomer().click();
				Thread.sleep(1000);
				Page.getclearNewCustomer().clear();
				Thread.sleep(1000);
				Page.getclearNewCustomer().sendKeys("New Customer");;
				Thread.sleep(1000);
				Page.getclickelsewhere().click();
				Thread.sleep(1000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	private static void DeleteCustomer() {
		try {
			Page.getgearclick().click();
			Thread.sleep(1000);
			Page.getactions().click();
			Thread.sleep(1000);
			Page.getdeletecuatomer().click();
			Thread.sleep(1000);
			Page.getdeletepermanently().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	private static void logout()
	{
		try
		{
			Page.getLogout().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void closeApplication()
	{
		try
		{
			Browser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
