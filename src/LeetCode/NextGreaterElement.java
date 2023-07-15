package LeetCode;

import java.util.*;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        n = scan.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0;i<arr2.length;i++){
            arr2[i] = scan.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            map.put(arr2[i],i);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(map);

        System.out.println("========================");

        int i = 0;
        int[] res = new int[arr.length];
        while(i<arr.length){

            if(map.containsKey(arr[i])){

                int start = map.get(arr[i]);
                for(int j = start;j<arr2.length;j++){
                    if(arr[i]<arr2[j]){
                        res[i] = arr2[j];
                        break;
                    }
                }
            }
            if(res[i]==0){
                res[i] = -1;
            }

            i++;
        }

        System.out.println(Arrays.toString(res));

    }
}
