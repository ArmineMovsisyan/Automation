package arrays;

public class ExampleSqr{

    public static void main(String[] args) {
        String[][] array = new String[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == 0 || i == 0 || j == array.length - 1 || i == array.length - 1) {
                    array[i][j] = " * ";
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




