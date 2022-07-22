package post_requests;

import Utils.JsonUtil;
import base_urls.DummyRestApiUrl;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.DummyApiDataPojo;
import pojos.DummyApiResponseBodyPojo;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class Post05 extends DummyRestApiUrl {

     /*
       URL: https://dummy.restapiexample.com/api/v1/create
       HTTP Request Method: POST Request
       Request body:
       Test Case: Type by using Gherkin Language
       Assert:
                    {
                            "employee_name": "Tom Hanks",
                            "employee_salary": 111111,
                            "employee_age": 23,
                            "profile_image": "Perfect image",
                            "id": 4891
                     }
                i) Status code is 200
                ii) Response body should be like the following
                    {
                        "status": "success",
                        "data": {
                            "employee_name": "Tom Hanks",
                            "employee_salary": 111111,
                            "employee_age": 23,
                            "profile_image": "Perfect image",
                            "id": 4891
                        },
                        "message": "Successfully! Record has been added."
                    }
     */
    /*
        Given
            URL: https://dummy.restapiexample.com/api/v1/create
            {
                            "employee_name": "Tom Hanks",
                            "employee_salary": 111111,
                            "employee_age": 23,
                            "profile_image": "Perfect image",
                            "id": 4891
            }
        When
            User Send the POST Request
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
                            "profile_image": "Perfect image",
                            "id": 4891
                        },
                        "message": "Successfully! Record has been added."
                    }

     */

    @Test
    public void post01() {
        // 1. Step : Set the Url
        spec.pathParam("first", "create");

        // 2. Step : Set the expected data
        DummyApiDataPojo dummyApiDataPojo = new DummyApiDataPojo("Tom Hanks", 111111, 23, "Perfect image");
        DummyApiResponseBodyPojo expectedData = new DummyApiResponseBodyPojo("success", dummyApiDataPojo, "Successfully! Record has been added.");
        // expected datayi olusturduk

        //3. Step: Send the post Request get the Response
        Response response = given().spec(spec).contentType(ContentType.JSON).body(dummyApiDataPojo).when().post("/{first}");
        response.prettyPrint();

        // 4. Step : Do Assertion

        DummyApiResponseBodyPojo actualdata = JsonUtil.convertJsonToJava(response.asString(), DummyApiResponseBodyPojo.class);
        System.out.println(actualdata);

        assertEquals(expectedData.getMessage(), actualdata.getMessage());
        assertEquals(expectedData.getStatus(), actualdata.getStatus());
        assertEquals(expectedData.getMessage(), actualdata.getMessage());

        assertEquals(expectedData.getData().getEmployee_name(),actualdata.getData().getEmployee_name());
        assertEquals(expectedData.getData().getEmployee_salary(),actualdata.getData().getEmployee_salary());
        assertEquals(expectedData.getData().getEmployee_age(),actualdata.getData().getEmployee_age());
        assertEquals(expectedData.getData().getProfile_image(),actualdata.getData().getProfile_image());



    }
}











