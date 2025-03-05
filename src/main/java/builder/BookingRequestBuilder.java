package builder;

import com.github.javafaker.Faker;
import dto.BookingRequest;
import dto.Bookingdates;

public class BookingRequestBuilder {

    public BookingRequest bookingRequestBuilder(){
        return BookingRequest.builder()
                .firstname(new Faker().name().firstName())
                .lastname(new Faker().name().lastName())
                .totalprice(Integer.parseInt((new Faker().number().digits(4))))
                .depositpaid(true)
                .bookingdates(new Bookingdates()
                                    .builder()
                                    .checkin("2018-01-01")
                                    .checkout("2019-01-01")
                                    .build())
                .additionalneeds("Breakfast")
                .build();
    }
}
