import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 Here : ");
        int num1 = sc.nextInt();

        int temp = num1;
        int rev = 0;

        while(num1>0){

            int temp1 = num1 % 10;
            rev = rev*10+temp1;
            num1 += num1;
        }

        if (temp == rev){
            System.out.println("The num is palindrome");
        }
        else{
            System.out.println("The num is not palindrome");
        }
        
    }
}
