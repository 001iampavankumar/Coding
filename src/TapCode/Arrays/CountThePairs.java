package TapCode.Arrays;

import java.util.*;


public class CountThePairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Set<Integer> s = map.keySet();
        int count = 0;
        for( int i : s){

            count = count + map.get(i)/2;
        }

        System.out.println(count);





    }
}
