public class Car {
    private String registrationNumber;
    private String color;

    // User-defined Ctor
    public Car(String registrationNumber, String color) {
        setRegistrationNumber(registrationNumber);
        setColor(color);
    }

    // Getter registrationNumber
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    // Getter color
    public String getColor() {
        return this.color;
    }

    // Setter registrationNumber -- a car assumed to never change its registrationNumber after instantiation
    private void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    // Setter Color -- a car assumed to never change its color after instantiation
    private void setColor(String color) {
        this.color = color;
    }
}
