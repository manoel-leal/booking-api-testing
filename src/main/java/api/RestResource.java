package api;

import io.restassured.response.Response;

import static api.SpecBuilder.getRequestSpec;
import static api.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;

public class RestResource {

    public static Response post(String path, Object request){
        return given(getRequestSpec())
                    .body(request)
                .when()
                    .post(path)
                .then()
                    .spec(getResponseSpec())
                    .extract()
                    .response();
    }


    public static Response get(String path){
        return given(getRequestSpec())
                .when()
                .get(path)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response get(String bookingId, String path){
        return given(getRequestSpec())
                .when()
                .get(path + bookingId)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response put(String path, String token, Object request, String playlistId){
        return given(getRequestSpec())
                .body(request)
                .header("Authorization", "Bearer " + token)
                .when()
                .put(path + playlistId)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }
}
