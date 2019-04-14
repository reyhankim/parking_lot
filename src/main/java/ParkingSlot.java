public class ParkingSlot {
    private boolean isOccupied;         // Identifies vacancy status of a ParkingSlot

    // Default Ctor
    public ParkingSlot() {
        this.release();
    }

    // Getter of isOccupied boolean value
    public boolean isOccupied() {
        return this.isOccupied;
    }

    // Release a parking slot: a parking slot is vacant, set isOccupied to false.
    public void release() {
        this.isOccupied = false;
    }

    // Allocate a parking slot for a car: set isOccupied to true.
    public void allocate() {
        this.isOccupied = true;
    }

}
