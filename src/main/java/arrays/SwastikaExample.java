package arrays;

public class SwastikaExample {
    public static void main(String[] args) {
        String[][] array = new String[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((j == 0 && i <= array.length / 2) || (j == array.length / 2) || (i == array.length / 2) || (i == 0 && j >= array.length / 2) || (j == array.length - 1 && i > array.length / 2) || (i == array.length - 1 && j <= array.length / 2)) {
                    array[i][j] = " x ";
                    System.out.print(array[i][j]);
                } else {
                    array[i][j] = "   ";
                    System.out.print(array[i][j]);
                }

            }
            System.out.println();
        }
    }
}



