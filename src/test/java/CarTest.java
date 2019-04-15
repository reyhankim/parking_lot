import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void carShouldBeCreated() {
        Car car = new Car("ABCDEFG", "Blue");
        Assertions.assertEquals(car.getRegistrationNumber(),"ABCDEFG");
        Assertions.assertEquals(car.getColor(), "Blue");
    }
}
