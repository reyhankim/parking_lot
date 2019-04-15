import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTest {
    @Test
    void TicketShouldBeCreated() {
        Ticket ticket = new Ticket(new Car("ABC", "Blue"), 1);
        assertEquals(ticket.getAffiliatedCar().getColor(), "Blue");
        assertEquals(ticket.getAffiliatedCar().getRegistrationNumber(), "ABC");
        assertEquals(ticket.getAllocatedSlotId(), 1);
    }
}
