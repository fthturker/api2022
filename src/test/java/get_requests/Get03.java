package get_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get03 extends JsonPlaceHolderBaseUrl {

     /*
        Given
            https://jsonplaceholder.typicode.com/todos/23
        When
            User send GET Request to the URL
        Then
            HTTP Status Code should be 200
      And
          Response format should be "application/json"
      And
          "title" is "et itaque necessitatibus maxime molestiae qui quas velit",
      And
          "completed" is false
      And
          "userId" is 2
     */


    @Test
    public void get03() {
        //1. Step: Set the Url
        // String url = "https://jsonplaceholder.typicode.com/todos/23"; //Önerilmiyor.
        spec.pathParams("first", "todos", "second", 23);

        //2. Step: Set the expected data

        //3. Step: Send the Request and get the Response

        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        //4. Step: Do Assertion

        //1. Yol
        response.then().
                assertThat().
                statusCode(200).
                contentType("application/json").
                body("title", equalTo("et itaque necessitatibus maxime molestiae qui quas velit")).
                body("completed", equalTo(false)).
                body("userId", equalTo(2));

        //2. Yol:
        response.then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("title", equalTo("et itaque necessitatibus maxime molestiae qui quas velit"),
                        "completed", equalTo(false),
                        "userId", equalTo(2));

        /*
        Note 1: Assertion yaparken Java calismayi durdurdugunda hata sonrasi kodlar calismaz
        Boylece hata sonrasi assertion'lar hakkında bilgi sahibi olamayiz
        Fakat hata oncesi assertion'lar gecmistir

        Note 2: eger kodumuzu hata noktasinda duracak sekilde yazarsak "Hard Assertion" yapmis oluyoruz
        Note 3: eger kodumuzu hata noktasinda durmayacak sekilde yazarsak "Soft Assertion" yapmis oluyoruz
        Note4 : eger coklu body() metodu icinde assert yaparsak "Hard Assert",
                tek body() metodu icinde assert yaparsak "Soft Assert",yapis oluyoruz

         */

    }


}