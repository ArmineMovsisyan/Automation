package arrays;

public class Array {
    public static void main(String[] args) {
        String[] array1 = new String[10];


        for (int i = 0; i < array1.length; i++) {
            if (i == 0) {
                array1[0] = "?";


            } else if (i % 2 != 0) {
                array1[i] = "k";

            } else {
                array1[i] = "z";

            }
            System.out.println("array1[" + i + "]" + " : " + array1[i]);
        }


    }

}








