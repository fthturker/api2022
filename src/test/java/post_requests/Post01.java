package post_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.Map;

import static io.restassured.RestAssured.given;


public class Post01 extends JsonPlaceHolderBaseUrl{
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
    public void post01(){
        // 1. Set the Url
        spec.pathParam("first","todos");

        // 2. Set the expected data
        JsonPlaceHolderTestData expectedData= new JsonPlaceHolderTestData();
        Map<String,Object>expecteddataMap= expectedData.expectedDataWithAllKeys(55,"Tidy your room",false);

        // 3. step: send post request and get Response
        Response response=given().
                spec(spec).
                contentType(ContentType.JSON).
                body(expecteddataMap).
                when().
                post("/{first}");
        response.prettyPrint();

    }
}