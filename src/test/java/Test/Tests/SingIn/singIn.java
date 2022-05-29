package Test.Tests.SingIn;

import Test.Steps.SignIn.singInSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class singIn {
    @Steps
    singInSteps singInSteps;

    @Given("user open amazon page")
    public void user_open_amazon_page() {
        singInSteps.user_open_amazon_page();
    }

    @When("user click on button account on navbar")
    public void user_click_on_button_account_on_navbar() {
        singInSteps.user_click_on_button_account_on_navbar();
    }

    @Then("user is directed to login page")
    public void user_is_directed_to_login_page() {
        singInSteps.user_is_directed_to_login_page();
    }


    @Given("user access login login page")
    public void user_access_login_login_page() {
        singInSteps.user_open_amazon_page();
        singInSteps.user_click_on_button_account_on_navbar();
        singInSteps.user_is_directed_to_login_page();
    }

    @When("user input email ([^\"]*)")
    public void user_input_email(String email) {
        singInSteps.user_input_email(email);
    }

    @When("click on button continue")
    public void click_on_button_continue() {
        singInSteps.click_on_button_continue();
    }

    @When("user input valid password")
    public void user_input_valid_password() {
        singInSteps.user_input_valid_password();
    }

    @When("click button on button sign in")
    public void click_button_on_button_sign_in() {
        singInSteps.click_button_on_button_sign_in();
    }

    @Then("user should be redirected to user home page as registered account")
    public void user_should_be_redirected_to_user_home_page_as_registered_account() {
        singInSteps.user_should_be_redirected_to_user_home_page_as_registered_account();
    }


    @Then("error non account found should be shown")
    public void error_non_account_found_should_be_shown() {
        singInSteps.error_non_account_found_should_be_shown();
    }

}
