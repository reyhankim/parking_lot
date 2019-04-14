public class Ticket {
    private static int activeTicket;            // Record how many activeTickets available

    private boolean isActive;                   // Ticket status
    private Car affiliatedCar;                  // Car affiliated to a ticket
    private ParkingSlot allocatedSlot;          // Allocated ParkingSlot for the ticket

    // User defined constructor for the ticket
    public Ticket(Car affiliatedCar, ParkingSlot allocatedSlot) {
        setAffiliatedCar(affiliatedCar);
        setAllocatedSlot(allocatedSlot);
        activateTicket();
    }

    // Check ticket activation status
    public boolean isActive() {
        return this.isActive;
    }

    // Getter for affiliatedCar
    public Car getAffiliatedCar() {
        return this.affiliatedCar;
    }

    // Getter for allocatedSlot
    public ParkingSlot getAllocatedSlot() {
        return this.allocatedSlot;
    }

    // Getter for activeTicket counter
    public static int getActiveTicket() {
        return activeTicket;
    }

    // set a ticket status to active
    private void activateTicket() {
        this.isActive = true;
        activeTicket++;
    }

    // set a ticket status to not active
    private void deactivateTicket() {
        this.isActive = false;
        activeTicket--;
    }

    // Setter for affiliatedCar
    private void setAffiliatedCar(Car affiliatedCar) {
        this.affiliatedCar = affiliatedCar;
    }

    // Setter for ParkingSlot allocation
    private void setAllocatedSlot(ParkingSlot allocatedSlot) {
        this.allocatedSlot = allocatedSlot;
    }
}
