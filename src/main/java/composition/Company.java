package composition;

public class Company {
    private String name;
    private Address address;

    @Override
    public String toString() {
        return String.format("%s,%s", name, address);
    }
}
