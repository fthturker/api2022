package post_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class WorkPost01 extends JsonPlaceHolderBaseUrl {
    /*
             Given
               1) https://jsonplaceholder.typicode.com/todos
               2)  {
                     "userId": 55,
                     "title": "Tidy your room",
                     "completed": false
                  }
            When
                I send POST Request to the Url
            Then
                Status code is 201
            And
                response body is like {
                                        "userId": 55,
                                        "title": "Tidy your room",
                                        "completed": false,
                                        "id": 201
                                        }
         */
    @Test
    public void post01() {
        // 1. Step: Set the Url


        // 2. Step: Set the expected Data

        // 3. Step: send Post Request and get response

        // 4. Step: Do Assertion




    }
}
