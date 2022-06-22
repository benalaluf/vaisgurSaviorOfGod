package lesson4;

public class mission2 {
    public static void main(String[] args) {
        int checker;
        int[] array = new int[]{
                1,2,1,1,1,1,4,5,6
        };
        for (int i = 0; i <array.length ; i++) {
            checker = array[i];
            for (int j = 0; j <array.length ; j++) {
                if (array[j]== checker && i!=j){
                    array[j] = 0;
                }
            }
        }
        for (int s = 0; s < array.length; s++) {
            System.out.println(array[s]);
        }
    }
}
