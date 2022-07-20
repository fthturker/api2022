package get_requests;

import Utils.JsonUtil;
import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.asserts.SoftAssert;
import pojos.Bookingpojo;
import pojos.JsonPlaceHolderPojo;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Get15ObjectMapper extends HerOkuAppBaseUrl {
    /*
    Given
	            https://restful-booker.herokuapp.com/booking/22
        When
		 		I send GET Request to the URL
		Then
		 		Status code is 200
                            {
                "firstname": "Oliver",
                "lastname": "Smith",
                "totalprice": 100,
                "depositpaid": true,
                "bookingdates": {
                    "checkin": "2022-07-18",
                    "checkout": "2022-07-19"
                },
                "additionalneeds": "Breakfast"
}
     */
    @Test
    public void get01() {
        // 1. Step : Set the Url
        spec.pathParams("first","booking","second",22);

        // 2. Step : Set the expected Data
        String expectedData = "{\n" +
                "                \"firstname\": \"Oliver\",\n" +
                "                \"lastname\": \"Smith\",\n" +
                "                \"totalprice\": 100,\n" +
                "                \"depositpaid\": true,\n" +
                "                \"bookingdates\": {\n" +
                "                    \"checkin\": \"2022-07-18\",\n" +
                "                    \"checkout\": \"2022-07-19\"\n" +
                "                },\n" +
                "                \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        Bookingpojo expectedDataPojo = JsonUtil.convertJsonToJava(expectedData,Bookingpojo.class);

        // 3. Step : Send the Get request and get the response
        Response response = given().spec(spec).when().get("/{first}/{second}");

        // 4. Step : Do assertion
        Bookingpojo actualDataPojo = JsonUtil.convertJsonToJava(response.asString(), Bookingpojo.class);

        // Hard assertion
        assertEquals(200,response.getStatusCode());
        assertEquals(expectedDataPojo.getFirstname(),actualDataPojo.getFirstname());
        assertEquals(expectedDataPojo.getLastname(),actualDataPojo.getLastname());
        assertEquals(expectedDataPojo.getTotalprice(),actualDataPojo.getTotalprice());
        assertEquals(expectedDataPojo.getDepositpaid(),actualDataPojo.getDepositpaid());
        assertEquals(expectedDataPojo.getBookingdates().getCheckin(),actualDataPojo.getBookingdates().getCheckin());
        assertEquals(expectedDataPojo.getBookingdates().getCheckout(),actualDataPojo.getBookingdates().getCheckout());
        assertEquals(expectedDataPojo.getAdditionalneeds(),actualDataPojo.getAdditionalneeds());

        //Soft Assertion
        // 1. Adim : SoftAssert objesi olustur
        SoftAssert softAssert=new SoftAssert();

        // 2. Adim : Assertion yap
        softAssert.assertEquals(actualDataPojo.getFirstname(),expectedDataPojo.getFirstname(),"Firstname uyusmadi");
        softAssert.assertEquals(actualDataPojo.getLastname(),expectedDataPojo.getLastname(),"Lasstname uyusmadi");
        softAssert.assertEquals(actualDataPojo.getTotalprice(),expectedDataPojo.getTotalprice(),"TotalPrice uyusmadi");
        softAssert.assertEquals(actualDataPojo.getDepositpaid(),expectedDataPojo.getDepositpaid(),"Depositpaid uyusmadi");
        softAssert.assertEquals(actualDataPojo.getBookingdates().getCheckin(),expectedDataPojo.getBookingdates().getCheckin(),"Checkin uyusmadi");
        softAssert.assertEquals(actualDataPojo.getBookingdates().getCheckout(),expectedDataPojo.getBookingdates().getCheckout(),"Checkout uyusmadi");
        softAssert.assertEquals(actualDataPojo.getAdditionalneeds(),expectedDataPojo.getAdditionalneeds(),"Additionalneeds uyusmadi");



        // 3. Adim : assertAll() methodunu calistir
        softAssert.assertAll();
    }
}
