package loop;

public class DeleteElement {
    public static void main(String[] args) {

        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};


        int removeIndex = 0;

        for (int i = removeIndex; i < my_array.length-1 ; i++) {
            my_array[i] = my_array[i + 1];

            System.out.println(my_array[i]);
        }
    }
}


