import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        ParkingLot parkingLot = null;
        boolean exitRequested = false;



        String[] input;
        String command;
        String arg1;
        String arg2;
        try {
            String path = args[0];
            File file = new File(path);
            if (file.exists() && !file.isDirectory()) {
                BufferedReader in = new BufferedReader(new FileReader(file));
                PrintStream fileOut = new PrintStream("./out.txt");
                System.setOut(fileOut);
                input = in.readLine().split(" ");        // Parse the string, delimited by space
                command = input[0];
                while (command != null) {
                    // LIST OF COMMANDS
                    if ("create_parking_lot".equals(command)) {
                        arg1 = input[1];
                        parkingLot = new ParkingLot(Integer.parseInt(arg1));
                    } else if ("park".equals(command)) {
                        arg1 = input[1];
                        arg2 = input[2];
                        assert parkingLot != null;
                        parkingLot.park(new Car(arg1, arg2));
                    } else if ("leave".equals(command)) {
                        arg1 = input[1];
                        assert parkingLot != null;
                        parkingLot.releaseParkingSlot(Integer.parseInt(arg1));
                    } else if ("status".equals(command)) {
                        assert parkingLot != null;
                        parkingLot.status();
                    } else if ("registration_numbers_for_cars_with_colour".equals(command)) {
                        arg1 = input[1];
                        assert parkingLot != null;
                        parkingLot.RegNumberBasedOnColor(arg1);
                    } else if ("slot_numbers_for_cars_with_colour".equals(command)) {
                        arg1 = input[1];
                        assert parkingLot != null;
                        parkingLot.printSlotNumbersOfColor(arg1);
                    } else if ("slot_number_for_registration_number".equals(command)) {
                        arg1 = input[1];
                        assert parkingLot != null;
                        parkingLot.printSlotNumberOfRegNumber(arg1);
                    }
                    input = in.readLine().split(" ");        // Parse the string, delimited by space
                    command = input[0];                         // Read the command
                }
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            while (!exitRequested) {
                input = in.readLine().split(" ");        // Parse the string, delimited by space

                command = input[0];                         // Read the command
                // LIST OF COMMANDS
                if ("create_parking_lot".equals(command)) {
                    arg1 = input[1];
                    parkingLot = new ParkingLot(Integer.parseInt(arg1));
                } else if ("park".equals(command)) {
                    arg1 = input[1];
                    arg2 = input[2];
                    assert parkingLot != null;
                    parkingLot.park(new Car(arg1, arg2));
                } else if ("leave".equals(command)) {
                    arg1 = input[1];
                    assert parkingLot != null;
                    parkingLot.releaseParkingSlot(Integer.parseInt(arg1));
                } else if ("status".equals(command)) {
                    assert parkingLot != null;
                    parkingLot.status();
                } else if ("registration_numbers_for_cars_with_colour".equals(command)) {
                    arg1 = input[1];
                    assert parkingLot != null;
                    parkingLot.RegNumberBasedOnColor(arg1);
                } else if ("slot_numbers_for_cars_with_colour".equals(command)) {
                    arg1 = input[1];
                    assert parkingLot != null;
                    parkingLot.printSlotNumbersOfColor(arg1);
                } else if ("slot_number_for_registration_number".equals(command)) {
                    arg1 = input[1];
                    assert parkingLot != null;
                    parkingLot.printSlotNumberOfRegNumber(arg1);
                } else if ("exit".equals(command)) {
                    exitRequested = true;
                }
            }
        }
    }
}