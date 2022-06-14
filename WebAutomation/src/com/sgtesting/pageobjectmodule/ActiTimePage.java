package com.sgtesting.pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver Browser)
	{
		PageFactory.initElements(Browser, this);
	}
	//UserName Text Field
		private WebElement username;
		public WebElement getUserName()
		{
			return username;
		}
		//Password Text Field
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}

		//Login button field
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}

		//FlyOutwindow field
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWindow()
		{
			return gettingStartedShortcutsPanelId;
		}


		//Logout Link
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogout()
		{
			return oLogout;
		}
		//user click
		@FindBy(xpath = "//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement otask;
		public WebElement getuser()
		{
			return otask;
		}
		//adduser click
		@FindBy(xpath = "//*[@id=\"createUserDiv\"]/div/div[2]")
		private WebElement adduser;
		public WebElement getadduser()
		{
			return adduser;
		}
		//firstName Text Field
		private WebElement firstName;
		public WebElement getfirstName()
		{
			return firstName;
		}
		//lastName Text Field
		private WebElement lastName;
		public WebElement getlastName()
		{
			return lastName;
		}
		//email Text Field
		private WebElement email;
		public WebElement getemail()
		{
			return email;
		}
		//username Text Field
		@FindBy(xpath = "//*[@id=\'userDataLightBox_usernameField\']")
		private WebElement usernameFieldinputFieldWithPlaceholder;
		public WebElement getusername()
		{
			return usernameFieldinputFieldWithPlaceholder;
		}
		//password Text Field
		private WebElement password;
		public WebElement getpwd()
		{
			return password;
		}
		//passwordcopy Text Field
		private WebElement passwordCopy;
		public WebElement getpasswordCopy()
		{
			return passwordCopy;
		}
		//createuser button
		@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement createuser;
		public WebElement getcreateuser()
		{
			return createuser;
		}
		//user click
		@FindBy(xpath = "//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement otask1;
		public WebElement getuser1()
		{
			return otask1;
		}

		//usernameclick button
		@FindBy(xpath = "//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement usernameclick;
		public WebElement getusernameclick()
		{
			return usernameclick;
		}
		//savechanges button
		@FindBy(xpath = "//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement savechangesclick;
		public WebElement getsavechangesclick()
		{
			return savechangesclick;
		}
		//delete user
		@FindBy(xpath = "//*[@id=\'userDataLightBox_deleteBtn\']")
		private WebElement deleteuser;

		public WebElement getdeleteuser()
		{
			return deleteuser;
		}
		//usernameclick button
		@FindBy(xpath = "//span[text()='case1, test']")
		private WebElement usernameclick1;
		public WebElement getusernameclick1()
		{
			return usernameclick1;
		}
		//user click
		@FindBy(xpath = "//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement otask2;
		public WebElement getuser2()
		{
			return otask2;
		}
		

	
}
