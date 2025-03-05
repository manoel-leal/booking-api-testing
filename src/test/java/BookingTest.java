import builder.BookingRequestBuilder;
import dto.BookingRequest;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static api.application.Booking.get;
import static api.application.Booking.post;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class BookingTest {

    @Test(description = "Create a booking")
    public void createBooking(){
        BookingRequest booking = new BookingRequestBuilder().bookingRequestBuilder();

        Response response = post(booking);
        assertThat(response.statusCode(), equalTo(HttpStatus.SC_OK));
    }

    @Test
    public void getAllBookingIds(){
        Response response = get();
        assertThat(response.statusCode(), equalTo(HttpStatus.SC_OK));
    }
}
