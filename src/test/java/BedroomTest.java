import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Guest guest;

    @Before
    public void setUp() {
        bedroom1 = new Bedroom(1,2, "double");
        guest = new Guest("Francois");
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddGuest() {
        bedroom1.addGuest(guest);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuest() {
        bedroom1.addGuest(guest);
        assertEquals(1, bedroom1.guestCount());
        bedroom1.removeGuest();
        assertEquals(0, bedroom1.guestCount());
    }

}
