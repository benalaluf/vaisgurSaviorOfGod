package lesson4;

public class mission1 {
    public static void main(String[] args) {
        int array[] = new int[]{
                1,2,3,4,5,6,7,8,9
        };
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int secondMax =array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max && array[i] > secondMax){
                secondMax =array[i];
            }
        }
        System.out.println(secondMax);
    }
}
