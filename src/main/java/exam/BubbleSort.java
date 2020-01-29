package exam;


public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {15, 39, 45, 16, 0, 35, 9};
        int sort;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    sort = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = sort;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
