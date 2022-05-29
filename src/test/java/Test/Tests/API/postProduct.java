package Test.Tests.API;

import Test.Steps.API.postProductSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class postProduct {
    @Steps
    Test.Steps.API.postProductSteps postProductSteps;

    @Given("on master post product Endpoint")
    public void on_master_post_product_Endpoint() {
        postProductSteps.on_master_post_product_Endpoint();
    }

    @When("hit end post product with {string} and body title: {string} price: {string} description: {string} image: {string} category: {string}")
    public void hit_end_post_product_with_and_body_title_price_description_image_category(String method, String title, String price, String description, String image, String category) {
        postProductSteps.requestCreateProduct(method, title, price, description, image, category);
    }

    @Then("success post product list")
    public void success_post_product_list() {
        postProductSteps.success_post_product_list();
    }

    @Then("failed post product list")
    public void failed_post_product_list() {
        postProductSteps.failed_post_product_list();
    }
}
