import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int number = value.nextInt();
        for (int i = 1; i <= 10; i++) {
            int prod = number*i;
            System.out.println(number + " * "+i +" = " + prod );
        }
    }


}
