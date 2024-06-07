import java.util.*;

public class Evenodd {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 Here : ");
        int num1 = sc.nextInt();

        if((num1&1)==1){
            System.out.println("number is odd");
        }
        else{
            System.out.println("number is even");
        }
        
    }
}
