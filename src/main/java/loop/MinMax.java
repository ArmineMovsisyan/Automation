package loop;

public class MinMax {
    public static void main(String[] args) {

        int[] array = new int[]{12, 53, 63, 115, 45, 67, 11, 23, 43, 24};
        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            else if (array[i] < min)
                min = array[i];

        }

        System.out.println("Maximum Number is : " + max);
        System.out.println("Minimum Number is : " + min);
    }
}








