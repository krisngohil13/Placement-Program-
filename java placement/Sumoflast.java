import java.util.*;

public class Sumoflast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int num2 = scanner.nextInt();
         int temp = num1%10;
         int temp2 = num2%10;
         int sum = temp + temp2;
         System.out.println("The sum of last digits of both the integers is: " + sum);
    }
}
