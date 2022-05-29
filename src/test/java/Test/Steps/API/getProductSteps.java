package Test.Steps.API;

import Test.Utils.APIFunct;
import Test.Utils.Endpoint;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import javax.sound.midi.Patch;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;


public class getProductSteps extends APIFunct implements Endpoint {

    public void on_master_get_product_Endpoint(){
        Assert.assertEquals(_getProduct,"https://fakestoreapi.com/products");
    }

    public void request_get_product_list(){
        Get(_getProduct,200);
    }

    public void success_get_product_list(){
        statusCode(200);
        SerenityRest.then().body(matchesJsonSchemaInClasspath("JsonSchema/getProduct.json"));
    }

    public void request_product_list(String method){
        switch (method){
            case "put" :    SerenityRest.put(_getProduct);
            case "patch":   SerenityRest.patch(_getProduct);
            case "delete":   SerenityRest.delete(_getProduct);
        }
    }

    public void failed_product_list(){
        statusCode(404);
    }
}

