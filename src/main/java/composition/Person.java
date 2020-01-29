package composition;


public class Person {
    private int age;
    private String name;
    private Address address;
    private Job job;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Job getJob() {
        return job;
    }

    public Person(int age, String name, Address address, Job job) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.job = job;
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%s,%s", age, name, address, job);
    }
}
