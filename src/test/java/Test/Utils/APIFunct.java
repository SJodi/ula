package Test.Utils;



import io.restassured.http.Header;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import java.util.HashMap;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class APIFunct {
    public void APIFunct(){}
    public void post(String url,int statusCode, String body){
        SerenityRest
                .given()
                .header(new Header("content-type","application/json"))
                .body(body)
                .when()
//                .post(url)
                .then()
                .statusCode(statusCode);
    }

    public void post(String url,int statusCode, String body, String bearerToken){
        SerenityRest
                .given()
                .header(new Header("content-type","application/json"))
                .header(new Header("Authorization","Bearer "+bearerToken))
                .body(body)
                .when()
                .post(url)
                .then()
                .statusCode(statusCode);
    }

    public void get(String url,int statusCode, String bearerToken){
        ValidatableResponse body = SerenityRest
                .given()
                .header(new Header("Authorization","Bearer "+bearerToken))
                .contentType("application/json")
                .when()
                .log().all()
                .get(url)
                .then()
                .statusCode(statusCode);
    }

    public String gettingBodyResponse(){
        return SerenityRest.then().extract().response().getBody().asString();
    }

    public String extString(String data){
        String value = SerenityRest.then().extract().path(data);
        //String value = SerenityRest.then().extract().jsonPath().getString(data);
        return value;
    }

    public Integer extInteger(String data){
        return SerenityRest.then().extract().path(data);
    }

    public HashMap exHashMap(String data){
        return SerenityRest.then().extract().path(data);
    }

    public void validasiSkema(String path){
        SerenityRest.then().body(matchesJsonSchemaInClasspath(path));
    }


    public void put(String url,int statusCode, String body){
        SerenityRest
                .given()
                .header(new Header("content-type","application/json"))
                .body(body)
                .when()
                .put(url)
                .then()
                .statusCode(statusCode);
    }

    public void patch(String url,int statusCode, String body){
        SerenityRest
                .given()
                .header(new Header("content-type","application/json"))
                .body(body)
                .when()
                .patch(url)
                .then()
                .statusCode(statusCode);
    }


    public void Get(String Endpoint, int RC) {
        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get(Endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(RC);
    }

    public void Delete(String Endpoint, int RC) {
        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .delete(Endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(RC);
    }

    public void getresponsetime(String url,int statusCode){
        SerenityRest
                .given()
                .header(new Header("content-type","application/json"))
                .when()
                .get(url)
                .then()
                .statusCode(statusCode)
                .time(greaterThanOrEqualTo(300L));
    }




    public static void statusCode(int code){
        SerenityRest.then().statusCode(code);
    }
}
