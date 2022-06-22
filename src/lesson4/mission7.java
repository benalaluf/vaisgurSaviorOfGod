package lesson4;

public class mission7 {
    public static void main(String[] args) {
        int[] array = new int[]{
                1,4,5,3,2,23,1,6,3,6,7,1,6
        };
        int min = array[0]+array[1];
        int num1=-1;
        int num2=-1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i]+array[j] <min&& i!=j){
                    min = array[i]+array[j];
                    num1 =array[i];
                    num2 = array[j];
                }
            }
        }
        System.out.println(num1+"," +num2);
    }
}
