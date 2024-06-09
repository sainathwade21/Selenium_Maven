package PomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);;
	}
	
	// Header WebElements
	@FindBy(xpath = "//div[text()='content tt']")
	private WebElement timetrackElement;
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement taskElement;
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement reportsElement;
	@FindBy(xpath = "//div[text()='Users']")
	private WebElement usersElement;
	@FindBy(xpath = "//div[text()='Work Schedule']")
	private WebElement workScheduleElement;
	@FindBy(xpath = "//div[text()='Settings']")
	private WebElement settingsElement;
	@FindBy(xpath = "//a[text()='View Time-Track']")
	private WebElement viewTimeTrack;

	// Elements present inside webpage
	@FindBy(xpath = "//select[@name='usersSelector.selectedUser']")
	private WebElement dropdwonElement;
	@FindBy(xpath = "//span[text()='Insert existing tasks']")
	private WebElement inserExistingTasks;
	@FindAll({@FindBy(xpath = "//a[text()='Create new tasks']"), @FindBy(xpath = "//img[@src='/img/default/add_new_tasks.gif?hash=1692528820']")})
	private WebElement createNewTask;
	@FindBy(xpath = "//input[@id='SubmitTTButton']")
	private WebElement saveLeaveTime;
	
	// Workdays
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[0]']")
	private WebElement workday0;
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[1]']")
	private WebElement workday1;
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[2]']")
	private WebElement workday2;
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[3]']")
	private WebElement workday3;
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[4]']")
	private WebElement workday4;
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[5]']")
	private WebElement workday5;
	@FindBy(xpath = "//div[@id='leaveButton_timeOffImgDiv[6]']")
	private WebElement workday6;
	
	// Action Elements
	@FindBy(xpath = "//span[text()='actiTIME for iPhone']")
	private WebElement actiTimeForIphone;
	@FindBy(xpath = "//span[text()='Help & Support']")
	private WebElement helpAndSupport;
	@FindBy(xpath = "//a[@id='profile-link']")
	private WebElement administrativeSystem;
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout;
	
	public WebElement getTimetrackElement() {
		return timetrackElement;
	}
	public WebElement getTaskElement() {
		return taskElement;
	}
	public WebElement getReportsElement() {
		return reportsElement;
	}
	public WebElement getUsersElement() {
		return usersElement;
	}
	public WebElement getWorkScheduleElement() {
		return workScheduleElement;
	}
	public WebElement getSettingsElement() {
		return settingsElement;
	}
	public WebElement getDropdwonElement() {
		return dropdwonElement;
	}
	public WebElement getInserExistingTasks() {
		return inserExistingTasks;
	}
	public WebElement getCreateNewTask() {
		return createNewTask;
	}
	public WebElement getSaveLeaveTime() {
		return saveLeaveTime;
	}
	public WebElement getWorkday0() {
		return workday0;
	}
	public WebElement getWorkday1() {
		return workday1;
	}
	public WebElement getWorkday2() {
		return workday2;
	}
	public WebElement getWorkday3() {
		return workday3;
	}
	public WebElement getWorkday4() {
		return workday4;
	}
	public WebElement getWorkday5() {
		return workday5;
	}
	public WebElement getWorkday6() {
		return workday6;
	}
	public WebElement getActiTimeForIphone() {
		return actiTimeForIphone;
	}
	public WebElement getHelpAndSupport() {
		return helpAndSupport;
	}
	public WebElement getAdministrativeSystem() {
		return administrativeSystem;
	}
	public WebElement getLogout() {
		return logout;
	}
	public WebElement getViewTimeTrack() {
		return viewTimeTrack;
	}
	public void setViewTimeTrack(WebElement viewTimeTrack) {
		this.viewTimeTrack = viewTimeTrack;
	}
	
}
