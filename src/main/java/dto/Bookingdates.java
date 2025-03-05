package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Bookingdates {
    public String checkin;
    public String checkout;

    public Bookingdates() {};
}
