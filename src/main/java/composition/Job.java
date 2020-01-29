package composition;


public class Job {
    private String title;
    private Company company;
    private int salary;

    public Job(String title, Company company, int salary) {
        this.title = title;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%d", title, company, salary);
    }
}
