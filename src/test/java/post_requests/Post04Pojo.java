package post_requests;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.BookingDatesPojo;
import pojos.BookingResponseBodyPojo;
import pojos.Bookingpojo;

import static io.restassured.RestAssured.given;
import static org.testng.AssertJUnit.assertEquals;

public class Post04Pojo extends HerOkuAppBaseUrl {
    /*
        Given
   1)         https://restful-booker.herokuapp.com/booking
   2)         {
                "firstname": "Ali",
                "lastname": "Can",
                "totalprice": 999,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2021-09-21",
                    "checkout": "2021-12-21"
                 }
                 "additionalneeds": "Breakfast with white tea, Dragon juice"
             }
        When
 		    I send POST Request to the URL
 	    Then
 		    Status code is 200
 		And
 		    Response body is like {
 		                            "bookingid": 16,
 		                            "booking" :{
                                        "firstname": "Ali",
                                        "lastname": "Can",
                                        "totalprice": 999,
                                        "depositpaid": true,
                                        "bookingdates": {
                                            "checkin": "2021-09-21",
                                            "checkout": "2021-12-21"
                                        }
                                        "additionalneeds": "Breakfast with white tea, Dragon juice"
                                     }
                                  }
     */
    @Test
    public void PostPojo01() {
        // 1. Step : Set the Url
        spec.pathParam("first", "booking");

        // 2. Step : Set the expected Data
        BookingDatesPojo bookingDates = new BookingDatesPojo("2021-09-21", "021-12-21");
        Bookingpojo bookingpojo = new Bookingpojo("Ali", "Can", 999,
                true, bookingDates, "Breakfast with white tea, Dragon juice");

        // 3. Step : Send POST Request and Get the Response
        Response response = given().
                spec(spec).
                contentType(ContentType.JSON).
                body(bookingpojo).
                when().
                post("/{first}");

        // 4. Step : Do Assertion
        BookingResponseBodyPojo actualPojo = response.as(BookingResponseBodyPojo.class);

        assertEquals(200,response.statusCode());
        assertEquals(bookingpojo.getFirstname(),actualPojo.getBooking().getFirstname());
        assertEquals(bookingpojo.getLastname(),actualPojo.getBooking().getLastname());
        assertEquals(bookingpojo.getTotalprice(),actualPojo.getBooking().getTotalprice());
        assertEquals(bookingpojo.getDepositpaid(),actualPojo.getBooking().getDepositpaid());
        assertEquals(bookingpojo.getBookingdates().getCheckin(),actualPojo.getBooking().getBookingdates().getCheckin());
        assertEquals(bookingpojo.getBookingdates().getCheckout(),actualPojo.getBooking().getBookingdates().getCheckout());

        assertEquals(bookingpojo.getAdditionalneeds(),actualPojo.getBooking().getAdditionalneeds());
    }
}
