package composition;


public class Address {
    private String country;
    private String city;
    private String address;
    private double qk;

    Address(String country, String city, String address, double qk) {
        this.country = country;
        this.city = city;
        this.address = address;
        this.qk = qk;

    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%f", country, city, address, qk);
    }
}
