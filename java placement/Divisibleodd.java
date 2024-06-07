import java.util.*;

public class Divisibleodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 150;
        int num2 = 445;
        
        for (int i=num1;i <= num2 ;i++){
            if(i % 2 != 0 && i % 7 ==0 && i % 3 != 0){
                System.out.print(i+" , ");
            }
        }
    }    
}




