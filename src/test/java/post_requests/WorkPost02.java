package post_requests;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.HerOkuAppTestData;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class WorkPost02 extends HerOkuAppBaseUrl {
    /*
   Given
           1) https://restful-booker.herokuapp.com/booking
           2) {
                "firstname": "John",
                "lastname": "Doe",
                "totalprice": 11111,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2021-09-09",
                    "checkout": "2021-09-21"
                                 }
              }
       When
           I send POST Request to the Url
       Then
           Status code is 200
           And response body should be like {
                                               "bookingid": 5315,
                                               "booking": {
                                                   "firstname": "John",
                                                   "lastname": "Doe",
                                                   "totalprice": 11111,
                                                   "depositpaid": true,
                                                   "bookingdates": {
                                                       "checkin": "2021-09-09",
                                                       "checkout": "2021-09-21"
                                                                   }
                                                           }
                                            }
    */
    @Test
    public void post01() {
        // 1. Step : Set the Url


        // 2. Step: set the expected Data


        // 3. Step : Send the Post request Get the Response


        // 4. Step: Do Assertion

    }
}
