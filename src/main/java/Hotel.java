import java.util.HashMap;

public class Hotel {

    private HashMap<String, Bedroom> bedrooms;
    private HashMap<String, ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new HashMap<String, Bedroom>();
        this.conferenceRooms = new HashMap<String, ConferenceRoom>();
           
    }
}
