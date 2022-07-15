package get_works;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class Work07 extends HerOkuAppBaseUrl {
 /*
        Given
            https://restful-booker.herokuapp.com/booking
        When
            User send a request to the URL
        Then
            Status code is 200
	  	And
	  		Among the data there should be someone whose firstname is "Adamz" and last name is "Dear"
	  		Veriler arasında adı "Adamz" ve soyadı "Dear" olan biri olmalıdır.
     */

    @Test
    public void get01() {

        //1. Step: Set the Url

        //https://restful-booker.herokuapp.com/booking?firstname=Aaron&lastname=Chen


        //2. Step: Set the expected data

        //3. Step: Send the request and get the response


        //4. Step: Do Assertion
    }
}