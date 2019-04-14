public class Ticket {
    private Car affiliatedCar;                  // Car affiliated to a ticket
    private int allocatedSlotId;                // Allocated ParkingSlot Id for the ticket

    // User defined constructor for the ticket
    public Ticket(Car affiliatedCar, int allocatedSlotId) {
        setAffiliatedCar(affiliatedCar);
        setAllocatedSlotId(allocatedSlotId);
    }

    // Getter for affiliatedCar
    public Car getAffiliatedCar() {
        return this.affiliatedCar;
    }

    // Getter for allocatedSlotId
    public int getAllocatedSlotId() {
        return this.allocatedSlotId;
    }

    // Setter for affiliatedCar
    private void setAffiliatedCar(Car affiliatedCar) {
        this.affiliatedCar = affiliatedCar;
    }

    // Setter for ParkingSlotId allocation
    private void setAllocatedSlotId(int allocatedSlotId) {
        this.allocatedSlotId = allocatedSlotId;
    }
}
