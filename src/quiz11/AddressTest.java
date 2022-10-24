package quiz11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

    @Test
    void displayAddress() {
        assertAll(() -> assertEquals("123 Main St, Anytown, CA 12345", new Address(123, "Main St", "Anytown", "CA",
                        12345).displayAddress()),
                () -> assertEquals("1140 N Columbo Ave, Sierra Vista, AZ 85635", new Address(1140, "N Columbo Ave",
                        "Sierra Vista", "AZ", 85635).displayAddress()),
                () -> assertEquals("1 1st Ave, New York, NY 10001", new Address(1, "1st Ave", "New York", "NY",
                        10001).displayAddress()),
                () -> assertEquals("1234 5th St, Los Angeles, CA 90001", new Address(1234, "5th St", "Los Angeles",
                        "CA", 90001).displayAddress()));




    }
}