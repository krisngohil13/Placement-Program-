//W.A.P to read n number in an array and remove the duplicate from array ?

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int num = scanner.nextInt();
        int[] a = new int[num];

        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }

        int j = removeDuplicates(a, num);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < j; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[n - 1];

        return j;
    }
    }


     
