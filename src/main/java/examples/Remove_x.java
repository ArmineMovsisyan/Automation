package examples;

public class Remove_x {
    public static void main(String[] args) {
     replace_x();
    }
    public static void replace_x(){
        String[] array = {"abcx", "xzk", "xxp", "kpp"};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace("x", "");
            System.out.println(array[i]);
        }
    }
}
