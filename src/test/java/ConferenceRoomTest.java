import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom mercer;
    private Guest guest;

    @Before
    public void setUp() {
        mercer = new ConferenceRoom("Mercer", 5);
        guest = new Guest("Claudine");
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, mercer.guestCount());
    }

    @Test
    public void canAddGuest() {
        mercer.addGuest(guest);
        assertEquals(1, mercer.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        mercer.addGuest(guest);
        assertEquals(1, mercer.guestCount());
        mercer.removeGuest();
        assertEquals(0, mercer.guestCount());
    }
}
