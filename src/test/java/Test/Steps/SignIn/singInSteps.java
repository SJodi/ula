package Test.Steps.SignIn;

import Test.Pages.SignIn.SignInPages;
import Test.Utils.DataSet;

public class singInSteps implements DataSet {

    SignInPages signInPages;
    public void user_open_amazon_page(){
        signInPages.open();
    }

    public void user_click_on_button_account_on_navbar(){
        signInPages.clickOnAccountNavbar();
    }

    public void user_is_directed_to_login_page(){
        signInPages.assertLoginPagesIsDisplayed();
    }

    public void user_input_email(String email){
        switch (email){
            case "Valid": signInPages.inputEmail(_valid);
            case "NonValid": signInPages.inputEmail(_nonValid);
        }
    }

    public void click_on_button_continue(){
        signInPages.clickButtonContinue();
    }

    public void user_input_valid_password(){
        String password = "Sumater@1";
        signInPages.inputPassword(password);
    }

    public void click_button_on_button_sign_in(){
        signInPages.clickButtonSignIn();
    }

    public void user_should_be_redirected_to_user_home_page_as_registered_account(){
       signInPages.assertHomePage();
    }

    public void error_non_account_found_should_be_shown(){
        signInPages.assertErrorAccountNotFound();
    }




}
