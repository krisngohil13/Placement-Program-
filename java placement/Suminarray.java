import java.util.*;

public class Suminarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size] ;
        System.out.println("Enter num of array : ");
        int even = 0;
        int odd = 0;
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for (int j= 0; j< arr.length;j++){
            if(arr[j]%2 == 0){
                even += arr[j];
            }
            else{
                odd += arr[j];
            }
        }
        System.out.println("the sum of even is  : " + even);
        System.out.print("the sum of odd is  : " + odd);

    }
}
