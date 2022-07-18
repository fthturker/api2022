package get_works;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Work09 extends JsonPlaceHolderBaseUrl{
   /*
        Given
	   	    https://jsonplaceholder.typicode.com/todos
		When
			 I send GET Request to the URL
		Then
			 1)Status code is 200
			 2)Print all ids greater than 190 on the console
			   Assert that there are 10 ids greater than 190
			 3)Print all userIds whose ids are less than 5 on the console
			   Assert that the number of userIds whose ids are less than 5 is 4
			 4)Print all titles whose ids are less than 5
			   Assert that "delectus aut autem" is one of the titles whose id is less than 5
     */

    @Test
    public void get01() {

        //1. Step: Set the Url



        //2. Step: Set the expected data

        //3. Step: Send the request and get the response


        //4. Step: Do Assertion
        // 1)Status code is 200


        // 2)Print all ids greater than 190 on the console


        // Assert that there are 10 ids greater than 190


        // 3)Print all userIds whose ids are less than 5 on the console


        //  Assert that the number of userIds whose ids are less than 5 is 4 (5 den kucuk 4 tane oldugunu dogrula)


        //  4)Print all titles whose ids are less than 5 (id leri 5 den kucuk olanlari)


        // Assert that "delectus aut autem" is one of the titles whose id is less than 5


    }
}
