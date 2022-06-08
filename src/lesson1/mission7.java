package lesson1;

public class mission7 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 1;
        int dif = num1 - num2;
        int odd = (dif+1) % 2;
        int even = (dif) % 2;
        int symbol = odd+even;
        int absNum = symbol*dif;
        int max = absNum+num1;
        System.out.println(max);


    }
}
