package get_works;
import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Work06 extends JsonPlaceHolderBaseUrl{
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

        //2. Step: Set the expected data
        //3. Step: Send the Request and get the Response

        //4. Step: Do Assertion



        //2. YOL

    }
}
