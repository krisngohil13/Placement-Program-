import java.util.*;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 Here : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 Here : ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3 Here : ");
        int num3 = sc.nextInt();
        
        int ans = (num1>num2)?(num1>num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The maximum number is " + ans);
    }
}