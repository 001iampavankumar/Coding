package CodingRounds;

import java.util.Scanner;

public class MinimumSumSubArrayWithKLength {


    static void minSum(int[] arr,int size){


        int i = 0;
        int j = size-1;

        int start = -1;
        int end = -1;
        int minSum = Integer.MAX_VALUE;
        while(j<arr.length){

            int sum = 0;
            for(int k = i;k<=j;k++){
                sum = sum + arr[k];
            }

            if(sum<minSum){
                minSum = sum;
                start = i;
                end = j;
            }
            //System.out.println();
            i++;
            j++;
        }

        for(int m = start;m<=end;m++){
            System.out.print(arr[m]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        minSum(arr,size);

    }
}
