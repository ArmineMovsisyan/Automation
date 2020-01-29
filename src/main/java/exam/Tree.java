package exam;


public class Tree {
    Animal[] array = new Animal[5];

    public void addAnimal(Animal animal) {
        if (animal.getClimb()) {

            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == null) {
                    array[i] = animal;
                    flag = true;
                    return;
                } else {
                    System.out.println("is busy " + i);
                }
            }
            if (!flag) {
                array[0] = animal;
            }
        } else {
            System.out.println("can't climb");
        }
    }

    public void printer() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getType() + " " + array[i].getClimb());
        }
    }
}



