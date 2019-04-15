import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ParkingLotTest {
    @Test
    void ParkingLotShouldBeCreated(){
        ParkingLot parkingLot = new ParkingLot(6);
        assertEquals(parkingLot.getParkingCapacity(), 6);

        parkingLot.park(new Car("ABC", "Red"));
        parkingLot.park(new Car("DEF", "Red"));
        parkingLot.park(new Car("BCA", "Blue"));
        parkingLot.park(new Car("CDE", "White"));
        parkingLot.park(new Car("ASF", "Red"));
        parkingLot.park(new Car("CAN", "White"));

        assertEquals(parkingLot.isFull(), true);

        parkingLot.park(new Car("CAW", "White"));

        for (int i = 1; i <= 6; i++) {
            parkingLot.releaseParkingSlot(i);
        }

        assertEquals(parkingLot.isFull(), false);
    }
}
