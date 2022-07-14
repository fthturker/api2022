package get_requests;

import base_urls.GorestBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertTrue;


public class Get11 extends GorestBaseUrl {
    /*
    Given
            https://gorest.co.in/public/v1/users
        When
            User send GET Request
        Then
            The value of "pagination limit" is 10
        And
            The "current link" should be "https://gorest.co.in/public/v1/users?page=1"
        And
            The number of users should  be 10
        And
            We have at least one "active" status
        And
            "Indra Ganaka", "Sarada Mehrotra", "Jagathi Chopra" are among the users
        And
            The female users are more than male users
     */

    @Test
    public void get01() {
        //1. Step: Set the Url
        spec.pathParam("first", "users");

        //2. Step: Set the expected data

        //3. Step: Send the request and Get the Response
        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

        //4. Step: Do Assertion

        response.
                then().
                assertThat().
                statusCode(200).
                body("meta.pagination.limit", equalTo(10),
                        "meta.pagination.links.current", equalTo("https://gorest.co.in/public/v1/users?page=1"),
                        "data.id", hasSize(10),
                        "data.status", hasItem("active"),
                        "data.name", hasItems("Aalok Acharya DDS", "Acharyasuta Chattopadhyay DC", "Shresth Nehru"));

        // bayan ve erkek sayisini karsılastıralim
        // 1. Yol: tum cinsiyetleri cekip bayan sayisi ile karsilastiralim
        JsonPath json = response.jsonPath();
        List<String> genders = json.getList("data.gender");
        System.out.println(genders);

        int nunOfFemales = 0;
        for (String w : genders) {
            if (w.equalsIgnoreCase("female")) {
                nunOfFemales++;
            }
        }
        System.out.println(nunOfFemales); //6

        assertTrue(nunOfFemales > genders.size() - nunOfFemales);

        // 2. Yol: Tum bayan ve baylari ayri ayri Groovy ile cekelim
        List<String> femaleList = json.getList("data.findAll{it.gender=='female'}.gender");
        System.out.println(femaleList); // 6

        List<String> maleList = json.getList("data.findAll{it.gender=='male'}.gender");
        System.out.println(maleList); // 4

        assertTrue(femaleList.size()>maleList.size());


    }
}