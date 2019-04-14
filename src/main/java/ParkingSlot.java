public class ParkingSlot {
    private boolean isOccupied;
    private int slotId;

    // Default Ctor
    public ParkingSlot(int slotId) {
        setSlotId(slotId);
        this.release();
    }

    // Getter of isOccupied boolean value
    public boolean isOccupied() {
        return this.isOccupied;
    }

    public int getSlotId() {
        return this.slotId;
    }

    // Release a parking slot: a parking slot is vacant, set isOccupied to false.
    public void release() {
        this.isOccupied = false;
    }

    // Allocate a parking slot for a car: set isOccupied to true.
    public void allocate() {
        this.isOccupied = true;
    }

    private void setSlotId(int slotId) {
        this.slotId = slotId;
    }
}
