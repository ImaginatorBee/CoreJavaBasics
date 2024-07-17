package ArrayQue;

import java.util.Arrays;

public class AverageArray {
    public static void main(String[] args) {
        int[] arr1={3,4,5,7,9};
        int sum=0;
        for (int i =0;i<arr1.length;i++){
            sum=sum+arr1[i];
        }
        System.out.println(sum);
        double average=0;
       average=sum/arr1.length;
        System.out.println("The average is :" +average);
    }
}
