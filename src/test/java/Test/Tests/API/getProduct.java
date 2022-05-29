package Test.Tests.API;

import Test.Steps.API.getProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class getProduct {

    @Steps
    getProductSteps getProductSteps;


    @Given("on master get product Endpoint")
    public void on_master_get_product_Endpoint() {
        getProductSteps.on_master_get_product_Endpoint();
    }

    @When("request get product list")
    public void request_get_product_list() {
        getProductSteps.request_get_product_list();
    }

    @Then("success get product list")
    public void success_get_product_list() {
        getProductSteps.success_get_product_list();
    }

    @When("request {string} product list")
    public void request_product_list(String method) {
        getProductSteps.request_product_list(method);
    }

    @Then("failed product list")
    public void failed_product_list() {
        getProductSteps.failed_product_list();
    }

}
