package get_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get04 extends JsonPlaceHolderBaseUrl {
    /*
        Given
            https://jsonplaceholder.typicode.com/todos
        When
	 	    I send a GET request to the Url
	    And
	        Accept type is “application/json”
	    Then
	        HTTP Status Code should be 200
	    And
	        Response format should be "application/json"
	    And
	        There should be 200 todos
	    And
	        "quis eius est sint explicabo" should be one of the todos title
	    And
	        2, 7, and 9 should be among the userIds
     */
    @Test
    public void get03() {
        //1. Set the url
        spec.pathParams("first", "todos");

        //2. Step: Set the expected data

        //3. Step: Send the Request and get the Response

        Response response = given().spec(spec).accept(ContentType.JSON).when().get("{first}"); // And de accept type da accept(ContentType.JSON) kullandik
        response.prettyPrint();

        //4. Step: Do Assertion

        response.then().
                assertThat().
                statusCode(200).
                contentType("application/json").
                body("id",hasSize(200)).   // kac tane id oldugunu soyledi
                body("title",hasItem("quis eius est sint explicabo")).   // icerip icermedigine bakiyor
                body("userId",hasItems(2, 7, 9));

        //2. YOL
        response.
                then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("id", hasSize(200),
                        "title", hasItem("quis eius est sint explicabo"),
                        "userId",hasItems(2, 7, 9));


    }
}
