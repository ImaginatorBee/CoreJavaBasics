package ArrayQue;

import java.util.Arrays;
import java.util.Scanner;

public class SortNS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Limit:");
        int number=in.nextInt();
        int[] arr1=new int[number];
        System.out.println("Enter Number Array:");
        for(int i=0;i<number;i++){
            arr1[i]=in.nextInt();
        }
        //int arr1[] = {1789, 2035, 1899, 1456, 2013};
//        String arr2[] = {"balu", "nishanth", "sreerag", "vishal", "amarnath"};
        System.out.println("Original Number Array is :"+Arrays.toString(arr1));
        Arrays.sort(arr1);

//        String Sorting
        String[] arr2 =new String[number];
        System.out.println("Enter Number Array:");
        for(int i=0;i<number;i++){
            arr2[i]=in.next();
        }
        System.out.println("Sorted Number Array:"+Arrays.toString(arr2));
        System.out.println("Original String Array is:"+Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted Number Array is:" +Arrays.toString(arr2));
    }
}
