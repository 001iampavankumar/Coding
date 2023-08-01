import java.util.*;

public class KthDistinctStringInArray {
    public static String kthDistinct(String[] arr, int k) {


        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();

        for(String str : arr){

            map.put(str,map.getOrDefault(str,0)+1);
        }

        System.out.println(map);
        Set<String> keys = map.keySet();
        int i = 1;
        for(String key : keys){

            System.out.println(key);

            if(map.get(key)==1){
                System.out.println(key);
                System.out.println("----");

                if(i==k){

                    return key;
                }
                i++;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};


        System.out.println(kthDistinct(arr,2));
    }
}
