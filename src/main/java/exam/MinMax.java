package exam;

public class MinMax {

    public static void main(String[] args) {


        int array[] = {3, 4, 15, 20, 30};

        max(array);
        System.out.println("Max value is: " + max(array));

        min(array);
        System.out.println("Min value is: " + min(array));
    }

    public static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static int min(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

}
