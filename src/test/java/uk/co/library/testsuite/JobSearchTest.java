package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(groups = {"sanity", "smoke", "regression"},dataProvider = "dataForJob",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle,
                                                           String location, String distance, String salaryMin,
                                                           String salaryMax, String salaryType, String jobType,
                                                           String result) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.acceptCookies();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        Thread.sleep(2000);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        Thread.sleep(2000);
        softAssert.assertEquals(result,resultPage.verifyTheResults(result),"Invalid data is displayed");
        softAssert.assertAll();
    }
}
