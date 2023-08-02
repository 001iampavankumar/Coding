package LeetCode;

import java.util.*;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int max = Integer.MIN_VALUE;

        int sum = 0;
        for(int i = 0;i<arr.length;i++){


            sum = sum + arr[i];
            if(max<sum){
                max = sum;
            }

            //if sum become negative we initialize it to zero
            //because if we encounter negative, it will be maximum if aabove condition satisfies
            if(sum<0){
                sum = 0;
            }

        }
        System.out.println(max);
    }
}
