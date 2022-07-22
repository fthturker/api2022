package put_request;

import Utils.JsonUtil;
import base_urls.DummyRestApiUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.DummyApiDataPojo;
import pojos.DummyApiResponseBodyPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Put02 extends DummyRestApiUrl {
    /*
        URL: https://dummy.restapiexample.com/api/v1/update/21
       HTTP Request Method: PUT Request
       Request body: {
                        "employee_name": "Tom Hanks",
                        "employee_salary": 111111,
                        "employee_age": 23,
                        "profile_image": "Perfect image"
                     }
       Test Case: Type by using Gherkin Language
       Assert:
                i) Status code is 200
                ii) Response body should be like the following
                    {
                        "status": "success",
                        "data": {
                            "employee_name": "Tom Hanks",
                            "employee_salary": 111111,
                            "employee_age": 23,
                            "profile_image": "Perfect image"
                        },
                        "message": "Successfully! Record has been updated."
                    }
     */
    /*
    Given
        URL: https://dummy.restapiexample.com/api/v1/update/21
        {
         "employee_name": "Tom Hanks",
         "employee_salary": 111111,
         "employee_age": 23,
         "profile_image": "Perfect image"
        }
    When
        User Semd The Put Request
    Then
        Status code is 200
    And
        Response body should be like the following
                    {
                        "status": "success",
                        "data": {
                            "employee_name": "Tom Hanks",
                            "employee_salary": 111111,
                            "employee_age": 23,
                            "profile_image": "Perfect image"
                        },
                        "message": "Successfully! Record has been updated."
                    }
     */
    @Test
    public void put01(){
        spec.pathParams("first","update","second",21);

        DummyApiDataPojo dummyApiDataPojo = new DummyApiDataPojo("Tom Hanks", 111111, 23, "Perfect image");
        DummyApiResponseBodyPojo expectedData = new DummyApiResponseBodyPojo("success", dummyApiDataPojo, "Successfully! Record has been updated.");


        Response response=given().spec(spec).contentType(ContentType.JSON).body(dummyApiDataPojo).when().put("/{first}/{second}");
        response.prettyPrint();

        DummyApiResponseBodyPojo actualdata = JsonUtil.convertJsonToJava(response.asString(), DummyApiResponseBodyPojo.class);
        System.out.println(actualdata);

        assertEquals(expectedData.getData().getEmployee_name(),actualdata.getData().getEmployee_name());
        assertEquals(expectedData.getData().getEmployee_salary(),actualdata.getData().getEmployee_salary());
        assertEquals(expectedData.getData().getEmployee_age(),actualdata.getData().getEmployee_age());
        assertEquals(expectedData.getData().getProfile_image(),actualdata.getData().getProfile_image());

    }
}
