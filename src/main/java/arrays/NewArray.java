package arrays;
public class NewArray {
    public static void main(String[] args) {
        String [][] array = new String[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array.length ; j++) {
                array[i][j]= "-";
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}
