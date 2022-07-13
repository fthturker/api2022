package get_works;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.*;

public class Work04 {
    /*
       Given
           https://restful-booker.herokuapp.com/booking/1001
       When
           User send a GET Request to the url
       Then
           HTTP Status code should be 404
       And
           Status Line should be HTTP/1.1 404 Not Found
       And
           Response body contains "Not Found"
       And
           Response body does not contains  "TechProEd"
       And
           Server is "Cowboy"
    */
    @Test
    public void get02() {
        // 1. Step: Set the Url


        // 2. Step: Set the Expected data(POST-PUT-PATCH)

        // 3. Step: Type code to send request


        // 4. Step: Do Assertion


        // Response body'de bulunan spesifik bir veri nasil assert edilir:
        // assertTrue() metodu parantexin icindeki deger true ise testi gecirir


        // Response body'de spesifik bir veri bulunmadıgını nasil assert edilir:
        // assertTrue() metodu parantexin icindeki deger true ise testi gecirir

        // assertEquals() metodu parantez icindeki iki deger esit ise testi gecirir


    }
}

