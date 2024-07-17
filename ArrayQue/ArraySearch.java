package ArrayQue;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]={1789,2035,1899,1456,2013};
        int temp=0;
        int count=0;
        temp=in.nextInt();
        for (int i : arr){
            if (temp==i){
                count++;
            }
        }
        if (count>0){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }
    }
}
