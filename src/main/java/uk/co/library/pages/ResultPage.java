package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement resultText;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyTheResults(String expected){
        Reporter.log("Get text from result" +resultText.toString());
        return getTextFromElement(resultText);
    }
}
