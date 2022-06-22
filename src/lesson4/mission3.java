package lesson4;

public class mission3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        array[40] = 43;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] != i+1){
                System.out.println(i);
            }
        }
    }
}
