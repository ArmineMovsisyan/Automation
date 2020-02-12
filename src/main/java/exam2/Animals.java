package exam2;

/**
 * Created BY Armine Movsisyan on 10 February,2020
 */
public class Animals implements Eat, Voice, Look, Breathe {
    private AnimalsType type;
    private int age;
    private int maxAge;

    public Animals(AnimalsType type, int age, int maxAge) {
        this.type = type;
        this.age = age;
        this.maxAge = maxAge;
    }


    public int getAge() {
        return age;
    }

    public AnimalsType getType() {
        return type;
    }

    public int getMaxAge() {
        return maxAge;
    }


    @Override
    public void eating(String type) {
        System.out.println(type + " is eating");
    }

    @Override
    public void voice() {
        switch (type) {
            case COVAYIN:
                System.out.println("bll-bll");
                break;
            case CAMAQAYIN:
                System.out.println("haf-haf");
                break;
            case ODAYIN:
                System.out.println("civ-civ");
                break;
            default:
                System.out.println("This type of animal doesn't exist");
        }
    }

    @Override
    public void looking() {
        if (age < maxAge) {
            System.out.println("Animal can look");
        } else {
            System.out.println("The animal died");
        }
    }

    @Override
    public void breathe() {
        if (age < maxAge) {
            System.out.println("Animal can breathe");
        } else {
            System.out.println("The animal died");
        }
    }
}
