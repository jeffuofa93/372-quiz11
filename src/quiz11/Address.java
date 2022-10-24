package quiz11;

public class Address {
    private final int streetNumber;
    private final String streetName;
    private final String city;
    private final String state;
    private final int zipCode;

    public Address(int streetNumber, String streetName, String city, String state, int zipCode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String displayAddress() {
        return streetNumber + " " + streetName + ", " + city + ", " + state + " " + zipCode;
    }
}
