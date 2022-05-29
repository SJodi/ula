package Test.Steps.API;

import Test.Utils.APIFunct;
import Test.Utils.Endpoint;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class postProductSteps extends APIFunct implements Endpoint {


    public void on_master_post_product_Endpoint(){
        Assert.assertEquals(_getProduct,"https://fakestoreapi.com/products");
    }

    public void requestCreateProduct(String method, String title, String price, String description, String image, String category){
        Map<String, Object> jsonmap = new HashMap<>();
        jsonmap.put("data", new HashMap<String, Object>() {
            {
                put("title", title);
                put("price", Integer.parseInt(price));
                put("description", description);
                put("image", image);
                put("category", category);
            }
        });

        switch (method){
            case "post" :    SerenityRest.post(_getProduct, jsonmap);
            case "patch":   SerenityRest.patch(_getProduct, jsonmap);
            case "delete":   SerenityRest.delete(_getProduct, jsonmap);
        }


    }

    public void success_post_product_list(){
        statusCode(200);
    }

    public void failed_post_product_list(){
        statusCode(404);
    }




}
