package get_works;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class Work08 extends HerOkuAppBaseUrl {
    /*
    Given
            https://restful-booker.herokuapp.com/booking/555
        When
            User send a GET request to the URL
        Then
            HTTP Status Code should be 200
        And
            Response content type is “application/json”
        And
     {
    "firstname": "Louise",
    "lastname": "Davidson",
    "totalprice": 615,
    "depositpaid": false,
    "bookingdates": {
        "checkin": "2022-07-15",
        "checkout": "2022-07-16"
                    },
    "additionalneeds": "Late Checkout"
    }

     */
    @Test
    public void get01() {

        //1. Step: Set the Url



        //2. Step: Set the expected data

        //3. Step: Send the request and get the response


        // response.prettyPrint();

        //4. Step: Do Assertion
        // 1. YOL

        // 2. YOL JsonPath Class kullanilir




        // 3. YOL Soft Aserttion
        // Soft Assertion icin 3 adim izlenir;

        // 1. ADIM SoftAssert Objesi olusturulur


        // 2. ADIM Obje araciligi ile assert yapilir


        // 3. ADIM assertAll() metodu kullanilir aksi takdirde kod her zaman pass olur



    }
}
