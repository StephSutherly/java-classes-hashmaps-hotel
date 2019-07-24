import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private ConferenceRoom picadilly;
    private Guest guest;

    @Before
    public void setUp() {
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 1, "single");
        picadilly = new ConferenceRoom("Picadilly", 3);
        guest = new Guest("Jean-Paul");
    }

    @Test
    public void canAddBedroom() {
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addConferenceRoom(picadilly);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInToBedroom() {
        hotel.addBedroom(bedroom1);
        hotel.checkInToBedroom(bedroom1, guest);
        assertEquals(1, hotel.bedroomCount());
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckInToConferenceRoom() {
        hotel.addConferenceRoom(picadilly);
        hotel.checkInToConferenceRoom(picadilly, guest);
        assertEquals(1, hotel.conferenceRoomCount());
        assertEquals(1, picadilly.guestCount());
    }

}
