package LeetCode;

import java.util.*;

public class LongestConsecutiveAlternate {

    static int longestConsecutive(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        if(nums.length==0){
            return 0;
        }

        int count = 1;
        int mCount = 0;
        for(int i = 0;i<nums.length-1;i++){

            if(nums[i+1]-nums[i]==1){
                count++;
            }else{

                if(mCount<count){
                    mCount = count;
                }
                count = 1;
            }
        }
        return mCount;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println(longestConsecutive(arr));

    }
}
