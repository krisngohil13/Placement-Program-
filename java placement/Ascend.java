// Accept three integer values from the user and display them in ascending order using only
// operators (i.e. without using if…else, switch case, or loop).?

import java.util.*;

public class Ascend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int b = scanner.nextInt();
        System.out.println("Enter third integer: ");
        int c = scanner.nextInt();
        

         int min = (a < b) ? a : b;
        min = (min < c) ? min : c;

        int max = (a > b) ? a : b;
        max = (max > c) ? max : c;

        int mid = a + b + c - min - max;

        System.out.println("Ascending order " + min +","+ mid +"," +max );

    }
    
}
