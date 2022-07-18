package get_works;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.JsonPlaceHolderTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Work10 extends JsonPlaceHolderBaseUrl {
    // De-serialization: JSON formatindan Java objesine cevirme
    //Serialization: Java objesini JSON formatina cevirme
    // De-serialization ve serialization iki turku yapilir:
    //Gson: Google tarafından üretiliştir.
    //Object Mapper: Daha popüler ***

    /*
         Given
            https://jsonplaceholder.typicode.com/todos/2
        When
            I send GET Request to the URL
        Then
            Status code is 200
            And "completed" is false
            And "userId" is 1
            And "title" is "quis ut nam facilis et officia qui"
            And header "Via" is "1.1 vegur"
            And header "Server" is "cloudflare"
            {
                "userId": 1,
                "id": 2,
                "title": "quis ut nam facilis et officia qui",
                "completed": false
            }
     */
    @Test
    public void get01() {
        //1. Step: Set the Url


        //2. Step: Set the expected data


        //3. Step: Send the request and get the Response



        //4. Step: Do Assertion



    }

    @Test
    public void get02() {
        //1. Step: Set the Url


        //2. Step: Set the expected data



        //3. Step: Send the request and get the Response

        //4. Step: Do Assertion


    }
}