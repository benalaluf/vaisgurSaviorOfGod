package lesson4;

public class mission5 {
    public static void main(String[] args) {
        int[] array = new int[]{
                1,2,3,4,4,5,5,1,1,6,7,8,1,4,3,9,6,7,5,4
        };
        int counter=0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
