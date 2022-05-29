package Test.Pages.SignUp;

import net.serenitybdd.core.pages.PageObject;
import org.jruby.runtime.callsite.AsetCallSite;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signUpPages extends PageObject {


    @FindBy(id="createAccountSubmit")
    WebElement buttonCreateAccount;
    public void clickButtonCreateAcount(){
        element(buttonCreateAccount).waitUntilVisible();
        element(buttonCreateAccount).click();
    }

    @FindBy(id = "ap_customer_name") WebElement yourNameField;
    @FindBy(id = "ap_email") WebElement emailOrPhoneField;
    @FindBy(id = "ap_password") WebElement passwordField;
    @FindBy(id = "ap_password_check") WebElement reEnterPassword;
    @FindBy(id = "continue") WebElement buttonContinue;
    public void assertSingUpPages(){
        element(yourNameField).waitUntilVisible();
        Assert.assertTrue(yourNameField.isDisplayed());
        Assert.assertTrue(emailOrPhoneField.isDisplayed());
        Assert.assertTrue(passwordField.isDisplayed());
        Assert.assertTrue(reEnterPassword.isDisplayed());
        Assert.assertTrue(buttonContinue.isDisplayed());
    }

    public void clickButtonContinue(){
        element(buttonContinue).click();
    }

    public void inputFullName(String name){
      element(yourNameField).sendKeys(name);
    }

    public void inputEmail(String emailOrPhone){
        element(emailOrPhoneField).sendKeys(emailOrPhone);
    }

    public void inputPassword(String password){
        element(passwordField).sendKeys(password);
    }

    public void inputRePassword(String rePassword){
        element(reEnterPassword).sendKeys(rePassword);
    }

    @FindBy(id = "cvf-input-code")
    WebElement sendOtp;
    @FindBy(xpath ="//span[@id='cvf-submit-otp-button']//input[@class='a-button-input']") WebElement buttonCreateAccountFinal;
    public void verifyEmailVerificationPages(){
        element(sendOtp).waitUntilVisible();
        Assert.assertTrue(sendOtp.isDisplayed());
        Assert.assertTrue(buttonCreateAccountFinal.isDisplayed());
    }


    @FindBy(xpath = "//div[@id='auth-customerName-missing-alert']//div[@class='a-alert-content']") WebElement alertName;
    @FindBy(xpath = "//div[@id='auth-email-missing-alert']//div[@class='a-alert-content']") WebElement alertEmail;
    @FindBy(xpath = "//div[@id='auth-password-missing-alert']//div[@class='a-alert-content']") WebElement alertPassword;
    public void assertErrorEmptyName(String nameMsg){
       element(alertName).waitUntilVisible();
        String actualMessage = element(alertName).getText();
        Assert.assertEquals(actualMessage,nameMsg);

    }

    public void assertErrorEmptyEmail(String emailMsg){
        element(alertEmail).waitUntilVisible();
        String actualMessage = element(alertEmail).getText();
        Assert.assertEquals(actualMessage,emailMsg);
    }

    public void assertErrorEmptyPassword(String passwordMsg){
        element(alertPassword).waitUntilVisible();
        String actualMessage = element(alertPassword).getText();
        Assert.assertEquals(actualMessage,passwordMsg);
    }
}
