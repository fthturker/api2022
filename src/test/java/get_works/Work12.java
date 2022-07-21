package get_works;

import base_urls.GorestBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Work12 extends GorestBaseUrl{
     /*
        Given
            https://gorest.co.in/public/v1/users/2965
        When
            User send GET Request to the URL
        Then
            Status Code should be 200
        And
            Response body should be like
         {
                 https://gorest.co.in/public/v1/users/2965
        "meta": null,
        "data": {
        "id": 2965,
        "name": "Mr. Gita Menon",
        "email": "gita_menon_mr@bayer.com",
        "gender": "female",
        "status": "inactive"
                 }
        }
     */
        @Test
    public void get01(){
            // 1. Step : Set the Url


            // 2. Step : Set the expected Data


            // 3. Step : Send the request and Get the response

            // 4. Step : Do Assertion


        }
}
