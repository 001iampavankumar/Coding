package LeetCode;
import java.util.*;
public class TopKFrequentElements {
    static int[] topKFrequent(int[] nums, int k) {

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i : nums){

            map.put(1,map.getOrDefault(i,0)+1);
        }

        int[] res = new int[map.size()];

        int index = 0;
        for(Map.Entry<Integer,Integer> i : map.entrySet()){

            res[index++] = i.getKey();

        }

        int[] fin = new int[k];
        int j = 0;
        for(int i = res.length-1;i>=0;i--){

            if(j==k){
                break;
            }
            fin[j++] = res[i];

        }

        return fin;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


    }
}
