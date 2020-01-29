package examples;

public class Fibonancci {
    public static void main(String[] args) {
        fibonancii();
    }

    static void fibonancii() {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 2] + array[i - 1];
            System.out.print(array[i] + " ");
        }

    }

}



