package arrays;

public class ReverseOrder {
    public static void main(String[] args) {
        int[] array = new int[13];
        for (int i = 0; i < array.length; i++) {
            array[i] = array.length - 1 - i;
            System.out.println("array[" + i + "] = " + array[i]);
        }

    }
}