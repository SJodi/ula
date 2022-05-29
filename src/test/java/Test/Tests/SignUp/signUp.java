package Test.Tests.SignUp;

import Test.Steps.SignUp.signUpSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.apache.commons.lang3.RandomStringUtils;

public class signUp {

    @Steps
    signUpSteps signUpSteps;

    @When("user click on button 'Create your Amazon account'")
    public void user_click_on_button_Create_your_Amazon_account(){
        signUpSteps.user_click_on_button_Create_your_Amazon_account();
    }

    @Then("sign up pages will be shown")
    public void sign_up_pages_will_be_shown() {
        signUpSteps.sign_up_pages_will_be_shown();
    }

    @When("fill all valid data")
    public void fill_all_valid_data() {
        signUpSteps.sign_up_pages_will_be_shown();
        String name = RandomStringUtils.random(15,true,false);
        String emailOrPhone = RandomStringUtils.random(8,true,true)+"@gmail.com";
        String password = RandomStringUtils.random(15,true,false);
        String rePassword = password;

        signUpSteps.fill_all_valid_data(name, emailOrPhone, password, rePassword);
    }

    @Then("mail verification is shown")
    public void mail_verification_is_shown() {
        signUpSteps.mail_verification_is_shown();
    }

    @When("fill with empty data")
    public void fill_with_empty_data() {
        String name = "";
        String emailOrPhone = "";
        String password = "";
        String rePassword = password;

        signUpSteps.fill_all_valid_data(name, emailOrPhone, password, rePassword);
    }

    @Then("error field cant be empty is shown")
    public void error_field_cant_be_empty_is_shown() {
        signUpSteps.error_field_cant_be_empty_is_shown();
    }

    @When("fill with password less than minimum char")
    public void fill_with_password_less_than_minimum_char() {
        String name = RandomStringUtils.random(15,true,false);
        String emailOrPhone = RandomStringUtils.random(8,true,true)+"@gmail.com";
        String password = RandomStringUtils.random(5,true,false);
        String rePassword = password;

        signUpSteps.fill_all_valid_data(name, emailOrPhone, password, rePassword);
    }
}
