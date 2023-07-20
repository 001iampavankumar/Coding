package LeetCode.Challenging;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class TopKFrequent {

    static int[] topFreq(int[] arr,int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : arr){

            map.put(i,map.getOrDefault(i,0)+1);
        }

        System.out.println(map);
        TreeMap<Integer, Integer> trap = new TreeMap<>();

        Set<Integer> set = map.keySet();


        for(int i :set){

            trap.put(map.get(i),i);
            if(trap.size()>k){
                trap.pollFirstEntry();
            }

        }
        System.out.println(trap);

        int[] res = new int[k];

        Set<Integer> s = trap.keySet();
        for(int i : s){
            res[--k] = trap.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        int[] res = topFreq(arr,3);

        System.out.println(Arrays.toString(res));

    }
}
