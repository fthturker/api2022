package get_works;

import base_urls.GorestBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertTrue;

public class Work13 extends GorestBaseUrl{
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
    public void get01(){
     // 1. Step : Set the Url


        //2. Step: Set the expected Data

        // 3. Step : Send the request and Get the Response


        // 4. Step : Do Assertion

        // bayan ve erkek sayisini karsılastıralim
        // 1. Yol: tum cinsiyetleri cekip bayan sayisi ile karsilastiralim
        //  The female users are more than male users


        // 2. Yol: Tum bayan ve baylari ayri ayri Groovy ile cekelim



    }
}
