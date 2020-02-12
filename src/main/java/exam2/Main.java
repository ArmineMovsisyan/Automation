package exam2;


/**
 * Created BY Armine Movsisyan on 10 February,2020
 */
public class Main {
    public static void main(String[] args) {
        People people1 = new People(PeopleType.WHITE, 30, 90);
        People people2 = new People(PeopleType.BLACK, 50, 90);
        Animals animal1 = new Animals(AnimalsType.COVAYIN, 5, 8);
        Animals animal2 = new Animals(AnimalsType.CAMAQAYIN, 30, 25);

        peopleEatAnimal(people1, animal1);
        people1.voice();
        animal1.voice();
        peopleEatAnimal(people2,animal2);


    }

    private static void peopleEatAnimal(People people, Animals animals) {

        if (people.getAge() < people.getMaxAge()) {
            if (animals.getType().equals(AnimalsType.COVAYIN) && animals.getMaxAge() > animals.getAge()) {
                people.eating("Fish");
            } else {
                if (animals.getAge() > animals.getMaxAge()) {
                    System.out.println("This kind of animal is  too old for eating");
                }
                System.out.println("People can't eat this type of animal");
            }
        } else {
            System.out.println("People died");
        }

    }
}



