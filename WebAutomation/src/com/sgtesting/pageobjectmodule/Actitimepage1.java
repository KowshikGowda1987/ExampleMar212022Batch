package com.sgtesting.pageobjectmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimepage1 {

	public Actitimepage1(WebDriver Browser)
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
	//task
	@FindBy(xpath = "//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[1]")
	private WebElement otask;
	public WebElement getclicktask()
	{
		return otask;
	}
	//Adduser
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
	private WebElement adduser;
	public WebElement getclickadduser()
	{
		return adduser;
	}
	//newcustomer
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement newcustomer;
	public WebElement getnewcustomer()
	{
		return newcustomer;
	}
	//enter new customer
	@FindBy(id = "customerLightBox_nameField")
	private WebElement enternewcustomer;
	public WebElement getenternewcustomer()
	{
		return enternewcustomer;
	}
	//description
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement customerdescription;
	public WebElement getcustomerdescription()
	{
		return customerdescription;
	}
	//create customer button
	@FindBy(xpath   = "//*[@id=\"customerLightBox_commitBtn\"]/div/span")
	private WebElement createcustomer;
	public WebElement getcreatecustomer()
	{
		return createcustomer;
	}
	//click on setting
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickongear;
	public WebElement getgearclick() 
	{
		return clickongear;
	}
	//action
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")
	private WebElement actions;
	public WebElement getactions() 
	{
		return actions;
	}
	//delete customer
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecuatomer;
	public WebElement getdeletecuatomer() 
	{
		return deletecuatomer;
	}
	//delete permanently
	@FindBy(xpath = "//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement deletepermanently;
	public WebElement getdeletepermanently() 
	{
		return deletepermanently;
	}
	//Click on new customer
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement NewCustomer;
	public WebElement getNewCustomer() 
	{
		return NewCustomer;
	}
	//clear new customer
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement clearNewCustomer;
	public WebElement getclearNewCustomer() 
	{
		return clearNewCustomer;
	}
	//click
	@FindBy(xpath = "//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div")
	private WebElement clickelsewhere;
	public WebElement getclickelsewhere() 
	{
		return clickelsewhere;
	}
	//newproject
	@FindBy(xpath = "//div[text()='+ New Project']")
	private WebElement newproject;
	public WebElement getnewproject()
	{
		return newproject;
	}
	//enterprojectname
	@FindBy(id  = "projectPopup_projectNameField")
	private WebElement enterprojectname;
	public WebElement getenterprojectname()
	{
		return enterprojectname;
	}
	//createproject
	@FindBy(xpath = "//*[@id=\'projectPopup_commitBtn\']/div/span")
	private WebElement createproject;
	public WebElement getcreateproject()
	{
		return createproject;
	}
	//click on setting
	@FindBy(xpath = "//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement clickongear1;
	public WebElement getgearclick1() 
	{
		return clickongear1;
	}
	//delete project
	@FindBy(xpath = "//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject;
	public WebElement getdeleteproject() 
	{
		return deleteproject;
	}
	//delete permanently
	@FindBy(xpath = "//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement deleteprojpermanently;
	public WebElement getdeleteprojpermanently() 
	{
		return deleteprojpermanently;
	}
	//actionproj
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement actionsproj;
	public WebElement getactionsproj() 
	{
		return actionsproj;
	}
	//projclick
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement NewProject;
	public WebElement getNewProject() 
	{
		return NewProject;
	}
	//clear new proj
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement clearNewProject;
	public WebElement getclearNewProject() 
	{
		return clearNewProject;
	}
	//addtask
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/div[1]/div[3]/div/div[2]")
	private WebElement addnewtask;
	public WebElement addnewtask() 
	{
		return addnewtask;
	}
	//createnewtask
	@FindBy(xpath = "//div[text()='Create new tasks']")
	private WebElement createnewtask;
	public WebElement createnewtask() 
	{
		return createnewtask;
	}
	//create task name1
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement createtaskname1;
	public WebElement  getcreatetaskname1() 
	{
		return  createtaskname1;
	}
	//create task name2
	@FindBy(xpath = "//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
	private WebElement createtaskname2;
	public WebElement  getcreatetaskname2() 
	{
		return  createtaskname2;
	}
	//createtask
	@FindBy(xpath = "//*[@id=\'createTasksPopup_commitBtn\']/div/span")
	private WebElement createtask;
	public WebElement createtask() 
	{
		return createtask;
	}
	//checkboxclick
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/table/tbody/tr/td[1]/div/div")
	private WebElement checkboxclick;
	public WebElement gcheckboxclick() 
	{
		return checkboxclick;
	}
	//deletetask
	@FindBy(xpath = "//*[@id=\'taskListBlock\']/div[1]/div[3]/div/div/div[4]/span")
	private WebElement deletetask;
	public WebElement getdeletetask() 
	{
		return deletetask;
	}
	//deletetaskpermanently
	@FindBy(xpath = "//*[@id=\'deleteTaskPopup_deleteConfirm_submitTitle\']")
	private WebElement deletetaskpermanently;
	public WebElement getdeletetaskpermanently() 
	{
		return deletetaskpermanently;
	}

}
