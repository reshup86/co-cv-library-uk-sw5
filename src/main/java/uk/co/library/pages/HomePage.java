package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(id="keywords")
    WebElement jobTitleField;
    @CacheLookup
    @FindBy(id="location")
    WebElement locationField;
    @CacheLookup
    @FindBy(id="distance")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(id="toggle-hp-search")
    WebElement moreSearchOptionsLink;
    @CacheLookup
    @FindBy(id="salarymin")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(id="salarymax")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(id="salarytype")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(id="tempperm")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(id="hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath="//iframe[@id='gdpr-consent-notice']")
    WebElement acceptIFrame;

    @CacheLookup
    @FindBy(id = "save")
    WebElement acceptCookiesButton;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Enter job title" +jobTitle+ "text to job title field: "+jobTitle.toString());
        sendTextToElement(jobTitleField,jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter location" +location+ "text to job title field: "+locationField.toString());
        sendTextToElement(locationField,location);
    }

    public void selectDistance(String distance) {
        Reporter.log("Select distance "+distance+" from distance dropdown" +distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on more search option link: " +moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter minimum salary " +minSalary+ "to minimum salary field"+salaryMin.toString());
        sendTextToElement(salaryMin,minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter maximum salary " +maxSalary+ "to maximum salary field"+salaryMax.toString());
        sendTextToElement(salaryMax,maxSalary);
    }

    public void selectSalaryType(String sType) {
        Reporter.log("Select salary type "+sType+" from salary type dropdown" +salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown,sType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Select job type "+jobType+" from job type dropdown" +jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on find jobs button" +findJobsBtn);
        clickOnElement(findJobsBtn);
    }
    public void acceptCookies(){
        driver.switchTo().frame(acceptIFrame);
        clickOnElement(acceptCookiesButton);
    }
}
