package ArrayQue;


import java.util.Arrays;
import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = in.nextInt();
        int[] arr = new int[n];
        int sum=0;
        System.out.println("Enter Array Values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i =0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println("The Sum is:");
        System.out.println(sum);
    }
}