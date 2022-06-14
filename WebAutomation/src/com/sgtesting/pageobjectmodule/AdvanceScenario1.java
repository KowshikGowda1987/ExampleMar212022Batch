package com.sgtesting.pageobjectmodule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {
	public static WebDriver Browser=null;
	public static Actitimepage2 Page=null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();

		createuser1(); createuser2(); createuser3(); logout();
		loginuser1(); logoutuser1();
		loginuser2(); logoutuser2();
		loginuser3(); logoutuser3();
		login();
	//	minimizeFlyOutWindow();
		modifyuser1(); modifyuser2(); modifyuser3(); logout();
		loginuser77(); logoutuser77();
		loginuser88(); logoutuser88();
		loginuser99(); logoutuser99();
		login();
		//minimizeFlyOutWindow();
		Deleteuser1(); Deleteuser2(); Deleteuser3();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Automation\\WebAutomation\\Library\\drivers\\chromedriver.exe");
			Browser=new ChromeDriver();
			Page=new Actitimepage2(Browser);
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

	private static void createuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("Test");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("User1");
			Thread.sleep(1000);
			Page.getemail().sendKeys("testuser1@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("TestUser1");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("TestUser1");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("TestUser1");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser2() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("Test2");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("User2");
			Thread.sleep(1000);
			Page.getemail().sendKeys("testuser2@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("TestUser2");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("TestUser2");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("TestUser2");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser3() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("Test3");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("User3");
			Thread.sleep(1000);
			Page.getemail().sendKeys("testuser3@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("TestUser3");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("TestUser3");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("TestUser3");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginuser1()
	{
		try
		{
			Page.getUserName().sendKeys("TestUser1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("TestUser1");
			Thread.sleep(1000);
			Page.getLogin1().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser1()
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
	private static void loginuser2()
	{
		try
		{
			Page.getUserName().sendKeys("TestUser2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("TestUser2");
			Thread.sleep(1000);
			Page.getLogin1().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser2()
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
	private static void loginuser3()
	{
		try
		{
			Page.getUserName().sendKeys("TestUser3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("TestUser3");
			Thread.sleep(1000);
			Page.getLogin1().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser3()
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
	private static void modifyuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("TestUser9");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("TestUser9");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser2()  
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("TestUser21");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("TestUser21");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser3() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("TestUser81");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("TestUser81");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginuser77()
	{
		try
		{
			Page.getUserName().sendKeys("TestUser1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("TestUser9");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser77()
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
	private static void loginuser88()
	{
		try
		{
			Page.getUserName().sendKeys("TestUser2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("TestUser21");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser88()
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
	private static void loginuser99()
	{
		try
		{
			Page.getUserName().sendKeys("TestUser3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("TestUser81");
			Thread.sleep(1000);
			Page.getLogin1().click();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logoutuser99()
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
	private static void Deleteuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser77click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Deleteuser2()  
	{
		try {
			Page.getuser88click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser3()
	{
		try {
			Page.getuser99click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert palert =  Browser.switchTo().alert();
			String content=palert.getText();
			System.out.println(content);
			palert.accept();
			Thread.sleep(2000);

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
