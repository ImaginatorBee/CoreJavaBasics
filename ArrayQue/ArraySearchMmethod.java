package ArrayQue;

import java.util.Scanner;

public class ArraySearchMmethod {
    public static boolean verify;
    public static int Check(int value,int arr[]){
        int index=0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == value) {
                index = i;
                verify=true;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr={102,201,203,230};
        System.out.println("Enter the Element You need to Search:");
        int Search=in.nextInt();
        int index = Check(Search,arr);
        index+=1;
        if (verify){
            System.out.println("the index of "+Search+" is found at: " +index);
        }else {
            System.out.println("Not found");
        }
    }
}
