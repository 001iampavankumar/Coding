package LeetCode;

import java.util.*;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            set.add(a);
        }
        System.out.println(set);

        int count = 1;
        int maxCount = 1;
        int len = set.size();

        if(set.size()>1){
            int curr = set.pollFirst();
            for(int i = 0;i<len-1;i++){

                if(set.size()<0){
                    break;

                }
                int next = set.pollFirst();
                //System.out.println(next+" - "+curr+": "+(next-curr));
                if(next-curr==1){
                    count++;


                }
                else{
                    //System.out.println("count = "+count);
                    if(maxCount<count){
                        maxCount=count;
                    }
                    count=1;
                }
                curr = next;
            }
            if(maxCount<count){
                maxCount = count;
            }
        }

        System.out.println(maxCount);
































//        ArrayList<Integer> arr = new ArrayList<>();
//
//
//        for(int i = 0;i<;i++){
//
//            arr.add(set.pollFirst());
//
//        }
//        System.out.println(arr);
//
//        int maxCount = 1;
//        int count = 1;
//        for(int i = 0;i<arr.size()-1;i++){
//            if(arr.get(i+1)-arr.get(i)==1){
//                count++;
//            }
//            else{
//                if(maxCount<count){
//                    maxCount = count;
//                }
//                count=1;
//            }
//        }
//
//        if(maxCount<count){
//            maxCount = count;
//        }
//
//        System.out.println(maxCount);
//



    }
}
