package Test.Steps.SignUp;

import Test.Pages.SignUp.signUpPages;

public class signUpSteps {

    signUpPages signUpPages;
    public void user_click_on_button_Create_your_Amazon_account(){
        signUpPages.clickButtonCreateAcount();

    }

    public void sign_up_pages_will_be_shown(){
        signUpPages.assertSingUpPages();
    }

    public void fill_all_valid_data(String name, String emailOrPhone, String password, String rePassword){
        signUpPages.inputFullName(name);
        signUpPages.inputEmail(emailOrPhone);
        signUpPages.inputPassword(password);
        signUpPages.inputRePassword(rePassword);
        signUpPages.clickButtonContinue();
    }

    public void mail_verification_is_shown(){
        signUpPages.verifyEmailVerificationPages();
    }

    public void error_field_cant_be_empty_is_shown(){
        signUpPages.assertErrorEmptyName("Enter your name");
        signUpPages.assertErrorEmptyEmail("Enter your email or mobile phone number");
        signUpPages.assertErrorEmptyPassword("Minimum 6 characters required");
    }



}
