package Test.Pages.SignIn;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPages extends PageObject {

    @FindBy(css = "#nav-link-accountList") WebElement accountNavbar;
    public void clickOnAccountNavbar(){
        element(accountNavbar).waitUntilVisible();
        element(accountNavbar).click();
    }

    @FindBy(css = "#ap_email") WebElement fieldEmailAndPhoneNumber;
    @FindBy(id = "continue") WebElement buttonContinue;
    @FindBy(id = "createAccountSubmit") WebElement buttonCreateYourAmazonAccount;
    public void assertLoginPagesIsDisplayed(){
        element(fieldEmailAndPhoneNumber).waitUntilVisible();
        Assert.assertTrue(fieldEmailAndPhoneNumber.isDisplayed());
        Assert.assertTrue(buttonContinue.isDisplayed());
        element(buttonCreateYourAmazonAccount).isDisplayed();

    }

    @FindBy(css="#ap_email") WebElement emailInput;
    public void inputEmail(String emailOrPhone){
        element(emailInput).sendKeys(emailOrPhone);
    }

    public void clickButtonContinue(){
        element(buttonContinue).click();
    }

    @FindBy(id="ap_password") WebElement passwordInput;
    public void inputPassword(String password){
        element(passwordInput).waitUntilVisible();
        element(passwordInput).sendKeys(password);
    }

    @FindBy(id = "signInSubmit") WebElement buttonSignIn;
    public void clickButtonSignIn(){
        element(buttonSignIn).click();
    }

    @FindBy(xpath ="//div[@class='a-section ya-personalized']/div[2]/div[1]//div[@class='a-box-inner']") WebElement yourOrdersMenu;
    @FindBy(xpath ="//div[@class='a-section ya-personalized']/div[2]/div[2]//div[@class='a-box-inner']") WebElement loginAndSecurityMenu;
    @FindBy(xpath ="//div[@class='a-section ya-personalized']/div[2]/div[3]//div[@class='a-box-inner']") WebElement primeMenu;
    @FindBy(xpath ="//div[@class='a-section ya-personalized']/div[3]/div[1]//div[@class='a-box-inner']") WebElement giftCardMenu;
    @FindBy(xpath ="//div[@class='a-section ya-personalized']/div[3]/div[2]//div[@class='a-box-inner']") WebElement yourPaymentMenu;
    @FindBy(xpath ="//div[@class='a-section ya-personalized']/div[3]/div[3]//div[@class='a-box-inner']") WebElement yourProfile;
    public void assertHomePage(){
        element(accountNavbar).waitUntilVisible();
        element(accountNavbar).click();
        Assert.assertTrue(yourOrdersMenu.isDisplayed());
        Assert.assertTrue(loginAndSecurityMenu.isDisplayed());
        Assert.assertTrue(primeMenu.isDisplayed());
        Assert.assertTrue(giftCardMenu.isDisplayed());
        Assert.assertTrue(yourPaymentMenu.isDisplayed());
        Assert.assertTrue(yourProfile.isDisplayed());

    }

    @FindBy(xpath = "//div[@id='auth-error-message-box']/div[@class='a-box-inner a-alert-container']") WebElement errorNotFoundAccount;
    public void assertErrorAccountNotFound(){
        element(errorNotFoundAccount).waitUntilVisible();
        Assert.assertTrue(errorNotFoundAccount.isDisplayed());
    }

}
