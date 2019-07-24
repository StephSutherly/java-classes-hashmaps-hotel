import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;
    private int nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, int nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
        this.nightlyRate = nightlyRate;
    }

    public int guestCount() {
        return this.guests.size();
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void removeGuest() {
        this.guests.remove(0);
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
