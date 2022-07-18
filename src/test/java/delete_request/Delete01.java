package delete_request;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class Delete01 extends JsonPlaceHolderBaseUrl {
    /*
    Given
            https://jsonplaceholder.typicode.com/todos/198
        When
	 		I send DELETE Request to the Url
	 	Then
		 	Status code is 200
		 	And Response body is { }
     */
    @Test
    public void delete01() {
        // 1. Step : Set the Url
        spec.pathParams("first", "todos", "second", 198);

        // 2. Step: Set the expected data
        Map<String,Object> expectedData=new HashMap<>(); // bos bir Map

        // 3. Step: Send Delete Request and get the response
        Response response=given().spec(spec).when().delete("/{first}/{second}");
        response.prettyPrint();
        // 4. Step: Do Assertion (Dogrulama yap)
        // 1. YOL
        Map<String,Object> actualMap=response.as(HashMap.class); // bos map
        response.
                then().
                assertThat().
                statusCode(200);

        assertEquals(actualMap,expectedData);

        // 2. YOL
        assertTrue(actualMap.size()==0);
        assertTrue(actualMap.isEmpty()); // tavsiye edilen

        // Delete request yapmadan once "Post Request" yapip o datayi silmeliyiz
    }
}