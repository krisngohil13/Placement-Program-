import java.util.*;

public class Series {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1 Here : ");
        int num1 = sc.nextInt();
        int n=0;
        for (int i=1 ; i < num1 + 2 ; i++){
             n = i + n;
            System.out.print(n + ","); 
        }
    }
}
