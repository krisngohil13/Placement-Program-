import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1 Here : ");
        int num1 = sc.nextInt();

        int flage=0;

        if(num1==0 || num1==1){
            flage=1;
        }

        for(int i=2;i<num1/2;i++)
        {
            if(num1%2 == 0){
                flage=1;
        }
    }

     if(flage == 1){
           System.out.println(num1 + "  The number is not prime");
        }
        else{
            System.out.println(num1 + "  The number is prime");
        }


    }
    
}
