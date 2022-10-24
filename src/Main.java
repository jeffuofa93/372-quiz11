import quiz11.Address;

public class Main {
    public static void main(String[] args) {
        Address address = new Address(123, "Main St", "Anytown", "CA", 12345);
        System.out.println(address.displayAddress());
        Address address1 = new Address(1140, "N Columbo Ave", "Sierra Vista", "AZ", 85635);
        System.out.println(address1.displayAddress());
    }
}