package api.application;

import api.RestResource;
import dto.BookingRequest;
import io.restassured.response.Response;

import static api.Route.BASE_PATH;
import static api.Route.BASE_PATH;

public class Booking {

    public static Response post(BookingRequest booking){
        return RestResource.post(BASE_PATH, booking);
    }

    public static Response get(){
        return RestResource.get(BASE_PATH);
    }

}
