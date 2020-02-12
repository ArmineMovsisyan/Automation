package exam2;


/**
 * Created BY Armine Movsisyan on 10 February,2020
 */


public class People implements Eat, Voice, Look, Breathe {
    private PeopleType type;
    private int age;

    public int getAge() {
        return age;
    }

    private int maxAge;

    public PeopleType getType() {
        return type;
    }

    public int getMaxAge() {
        return maxAge;
    }


    public People(PeopleType type, int age, int maxAge) {
        this.type = type;
        this.age = age;
        this.maxAge = maxAge;
    }

    @Override
    public void eating(String type) {

        System.out.println("People eating: " + type);

    }

    @Override
    public void voice() {
        switch (type) {
            case BLACK:
                System.out.println("I'm a white man :P");
                break;
            case WHITE:
                System.out.println("I'm a black man :(");

        }
    }

    @Override
    public void looking() {
        if (age < maxAge) {
            System.out.println("People can look");
        } else {
            System.out.println("People died");
        }
    }

    @Override
    public void breathe() {
        if (age < maxAge) {
            System.out.println("People can breathe");
        } else {
            System.out.println("People died");
        }
    }
}

