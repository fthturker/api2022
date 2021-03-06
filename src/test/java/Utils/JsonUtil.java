package Utils;

import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class JsonUtil {

    private static ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
    }
    // 1. Method: Json datasini Java Objesine cevirir (De-serialization)

    public static <T> T convertJsonToJava(String json, Class<T> cls) { // Generic method
        T javaResult = null;
        try {
            javaResult = mapper.readValue(json, cls);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return javaResult;
    }


    // 2. Method: Java Objesini Json dataya cevirir  (serialization)
    public static String convertJavaObjectToJson(Object obj) {

        String jsonResult = null;

        try {
            jsonResult = mapper.writeValueAsString(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonResult;



    }
}
