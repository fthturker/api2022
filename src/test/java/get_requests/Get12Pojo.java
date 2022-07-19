package get_requests;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.BookingDatesPojo;
import pojos.Bookingpojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get12Pojo extends HerOkuAppBaseUrl {
    /*
            Given
                    https://restful-booker.herokuapp.com/booking/18
                    I send GET Request to the URL
                Then
                    Status code is 200
                And
                    Response body is like {
                "firstname": "omto",
                "lastname": "nena",
                "totalprice": 112,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2018-01-01",
                    "checkout": "2019-01-01"
                },
                "additionalneeds": "Breakfast"
            }
}

     */
    @Test
    public void getPojo01() {

        // 1. Step : Set the Url
        spec.pathParams("first", "booking", "second", 18);

        // 2. Step : Set the expected Data
        BookingDatesPojo bookingDatesPojo = new BookingDatesPojo("2018-01-01", "2019-01-01");
        Bookingpojo bookingpojo = new Bookingpojo("omto", "nena", 112,
                true, bookingDatesPojo, "Breakfast");

        // 3. Step : Send POST Request and Get the Response
        Response response = given().spec(spec).when().get("/{first}/{second}");

        // 4 Step : Do Assertion
        Bookingpojo actualPojo = response.as(Bookingpojo.class);
        assertEquals(200,response.getStatusCode());

        assertEquals(bookingpojo.getFirstname(),actualPojo.getFirstname());
        assertEquals(bookingpojo.getLastname(),actualPojo.getLastname());
        assertEquals(bookingpojo.getTotalprice(),actualPojo.getTotalprice());
        assertEquals(bookingpojo.getDepositpaid(),actualPojo.getDepositpaid());

        assertEquals(bookingpojo.getBookingdates().getCheckin(),actualPojo.getBookingdates().getCheckin());
        assertEquals(bookingpojo.getBookingdates().getCheckout(),actualPojo.getBookingdates().getCheckout());

        assertEquals(bookingpojo.getAdditionalneeds(), actualPojo.getAdditionalneeds());
    }
}
