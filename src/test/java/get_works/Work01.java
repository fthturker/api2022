package get_works;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class Work01 {
    // https://restful-booker.herokuapp.com/booking/17379 url'ine bir GET request gonderdigimizde donen Response'un,
    //        status code'unun 200,
    //        ve content type'inin "application/json"; charset=utf-8,
    //        ve Server isimli Header'in degerinin Cowboy,
    //        ve status Line'in HTTP/1.1 200 OK
    //        ve response suresinin 5 sn'den kisa oldugunu manuel olarak test ediniz.

    @Test
    public void work01(){
        String url="https://restful-booker.herokuapp.com/booking/8015";
        Response response=given().accept("application/json").when().get(url);
        response.prettyPrint();
        response.then().assertThat().statusCode(200)
                .contentType("application/json")
                .header("Server",equalTo("Cowboy"))
                .statusLine("HTTP/1.1 200 OK");
        response.then().assertThat().time(lessThan((long)5000));
    }
}
