package get_requests;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*; // hepsi anlamına gelen * koyduk

public class Get01 {

    /*
        1) Postman manuel API testi icin kullanilir.
        2) API otomasyon testi icin Rest-Assured Library kullaniyoruz
        3) Otomasyon kodlarinin yazimi icin su adimlari izliyoruz:
            a) Gereksinimleri anlama
            b) Test Case'i yazma
                - Test case yazimi icin 'Gerkin Language' kullaniyoruz
                    'Gherkin' bazi keywordlere sahip, bunlar:
                    x) Given: On kosullar
                    y) When : Aksiyonlar -->Get, Put, ...
                    z) Then : Donutler --> Dogrulama, response, ...
                    t) And : Coklu islemler icin kullanilir

            c) Test kodunun yazimi
                i)   Set the URL (url i ilk once kurmamiz lazim)
                İİ)  set the Expected data (POT-PUT-PATCH) (beklenen data'nin olusturalmasi)
                iii) Type code to send request (talep gondermek icin kod yazacagiz)
                iv)  Do Assertion (dogrulama yapacagiz bekledigimiz ile gerceklesen datayi)
    */
    /*
    Given
         https://restful-booker.herokuapp.com/booking/555
    When
         User sends a GET Request to the url
    Then
         HTTP Status Code should be 200 --> status kodunun 200 olmasini istiyoruz
    And
         Content Type should be JSON --> icerik tipinin JSON olup olmadigini kontrol edecegiz
    And
         Status Line should be HTTP/1.1 200 OK -->
     */

    @Test
    public void get01() {
        // i)   Set the URL
        String url = "https://restful-booker.herokuapp.com/booking/55"; //String konteynir acıp ismini url yaziyoruz

        // İİ)  set the Expected data(POT-PUT-PATCH) -->get oldugu icin bu adimi atliyoruz

        // iii) Type code to send request
        Response response = given().when().get(url);

        response.prettyPrint();

        // iv)  Do Assertion
        response.then().assertThat().statusCode(200).contentType("application/json").statusLine("HTTP/1.1 200 OK");

        // 'Status Code' nasil yazdirilir
        System.out.println("Status Code : " + response.statusCode());

        // 'contentType' nasil yazdirilir
        System.out.println("contentType: " + response.contentType());

        // 'statusLine' nasil yazdirilir
        System.out.println("statusLine: " + response.statusLine());

        // 'Header' nasil yazdirilir

        System.out.println("Headers:\n" + response.headers()); // tamamini verir

        System.out.println(response.header("Connection"));
        System.out.println(response.header("User-Agent"));

        // 'Time' nasil yazdirilir
        System.out.println("Time : " + response.getTime());


    }

}


















