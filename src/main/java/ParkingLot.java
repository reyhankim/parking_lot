import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private ArrayList<Ticket> tickets;                  // A collection of all tickets
    private ArrayList<Ticket> activeTickets;            // A collection of all active tickets
    private Map<Integer,ParkingSlot> parkingSlotMap;    // HashMap of active tickets and its parkingSlot
    private int parkingCapacity;                        // Number of ParkingSlot in the ParkingLot

    // Initialize a ParkingLot with maximum capacity of parkingCapacity
    // All initialized ParkingSlots are marked as unoccupied
    public ParkingLot(int parkingCapacity) {
        setParkingCapacity(parkingCapacity);
        this.parkingSlotMap = new HashMap<Integer, ParkingSlot>(getParkingCapacity());
        this.tickets = new ArrayList<Ticket>();
        for (int i = 0; i < getParkingCapacity(); i++) {
            this.parkingSlotMap.put(i+1, new ParkingSlot());
        }
        System.out.println("Created a parking lot with " + this.getParkingCapacity() + " slots");
    }

    // Getter for parkingCapacity
    public int getParkingCapacity() {
        return this.parkingCapacity;
    }

    // Setter for parkingCapacity
    public void setParkingCapacity(int parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }

    // Check for full ParkingLot, returns true if the ParkingLot is full
    public boolean isFull() {
        return !this.parkingSlotMap.containsValue(null);
    }

    // Allocate a nearest parkingSlot for a car
    // Definition of nearest: unoccupied parkingSlot with the smallest slotId available
    public void park(Car car) {
        if (!isFull()) {
            for (Map.Entry<Integer, ParkingSlot> entry : this.parkingSlotMap.entrySet()) {
                if (!entry.getValue().isOccupied()) {
                    Ticket newTicket = new Ticket(car, entry.getKey());
                    this.activeTickets.add(entry.getKey(), newTicket);
                    this.tickets.add(newTicket);
                    entry.getValue().allocate();
                    System.out.println("Allocated slot number: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Sorry, parking lot is full");
        }
    }

    // Unallocate a parkingSlot by the slotId
    // Deactivate a ticket, then move the ticket containing vehicle information to historicalTickets
    // ASSUMPTION 1 : If there is no car assigned on a parkingSlot, say "Slot number <slotId> is free" anyway.
    // ASSUMPTION 2 : If user enter invalid slotId, nothing will happen
    public void releaseParkingSlot(int slotId) {
        if (slotId <= this.getParkingCapacity()) {
            for (Map.Entry<Integer, ParkingSlot> entry : this.parkingSlotMap.entrySet()) {
                if (entry.getKey() == slotId) {
                    this.activeTickets.remove(entry.getKey().intValue());
                    entry.getValue().release();
                    break;
                }
            }
            System.out.println("Slot number " + slotId + " is free");
        } else {
            assert slotId > this.getParkingCapacity();      // Recheck whether slotId is really > parkingCapacity at Debug Level
        }
    }

    // Print all parking cars at the parkingLot
    // ASSUMPTION : Even if there is no car parking, this method will still print the headers
    public void status() {
        System.out.println("Slot No.  Registration No    Colour");
        for (Map.Entry<Integer, ParkingSlot> entry : this.parkingSlotMap.entrySet()) {
            if (entry.getValue().isOccupied()) {
                System.out.format("%9d%18s%20s\n", entry.getKey(), this.activeTickets.get(entry.getKey()).getAffiliatedCar().getRegistrationNumber(), this.activeTickets.get(entry.getKey()).getAffiliatedCar().getColor());
            }
        }
    }


}
