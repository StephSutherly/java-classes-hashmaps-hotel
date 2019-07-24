import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();

    }

    public void addBedroom(Bedroom bedroom1) {
        this.bedrooms.add(bedroom1);
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addConferenceRoom(ConferenceRoom picadilly) {
        this.conferenceRooms.add(picadilly);
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void checkInToBedroom(Bedroom bedroom1, Guest guest) {
        bedroom1.addGuest(guest);
    }

    public void checkInToConferenceRoom(ConferenceRoom picadilly, Guest guest) {
        picadilly.addGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom1, int numOfNights) {
        Booking booking = new Booking(bedroom1, numOfNights);
        return booking;
    }

}
