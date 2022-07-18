package post_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.Assert;
import pojos.JsonPlaceHolderPojo;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class Post03Pojo extends JsonPlaceHolderBaseUrl {
    /*
         Given
            https://jsonplaceholder.typicode.com/todos
            {
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
    public void postPojo01() {
        // 1. Step : Set the Url
        spec.pathParam("first", "todos");

        // 2. Step : Set the expected data
        JsonPlaceHolderPojo requestBody=new JsonPlaceHolderPojo(55,"Tidy your room",false);

        // 3. Step : Send POST Request and get the Response
        Response response=given().
                spec(spec).
                contentType(ContentType.JSON).
                body(requestBody).
                when().
                post("/{first}");

        response.prettyPrint();

        // 4. Step : Do assertion
        JsonPlaceHolderPojo actualData = response.as(JsonPlaceHolderPojo.class);

        Assert.assertEquals(actualData.getUserId(),requestBody.getUserId());
        Assert.assertEquals(actualData.getTitle(),requestBody.getTitle());
        Assert.assertEquals(actualData.getCompleted(),requestBody.getCompleted());

        assertEquals(requestBody.toString(),actualData.toString());
    }

}
