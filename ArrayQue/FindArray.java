package ArrayQue;

import java.util.Scanner;

public class FindArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = {1789, 2035, 1899, 1456, 2013};
        System.out.println("Enter the element:");
        int search = in.nextInt();
        int temparr[] = new int[5];
        int i1 = 0;
        int temp = 0;
        int count = 0;
//        temp = in.nextInt();
        for (int i : arr) {
            if (search == i) {
                count++;
                temparr[i1] = i1 + i;
                i1++;
            }
        }
        if (count > 0) {
            for (int i=0;i<temparr.length;i++) {
                if (temparr[i] != 0) {
                    System.out.println("Found at" + temparr[i]);
                } else {
                    System.out.println("Not Found");
                }
            }
        }
    }
}
