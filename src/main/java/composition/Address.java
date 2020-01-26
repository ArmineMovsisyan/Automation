package composition;


public class Address {
    private String country;
    private String city;
    private int val;
    private double qk;

    Address(String country, String city, int value, double qk) {
        this.country = country;
        this.city = city;
        this.val = value;
        this.qk = qk;

    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d,%f", country, city, val, qk);
    }
}
