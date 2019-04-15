import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingSlotTest {
    @Test
    void ParkingSlotShouldBeCreated() {
        ParkingSlot parkingSlot = new ParkingSlot();
        assertEquals(parkingSlot.isOccupied(), false);

        parkingSlot.allocate();
        assertEquals(parkingSlot.isOccupied(), true);
    }
}
