package HackerRank;

import java.util.Scanner;
import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>();

        int loop = 0;

        while(loop>=0){
            System.out.println("in loop");
            int count = 0;
            for(int i : arr){

                if(i!=0){
                    count++;
                }
            }

            if(count==0){
                break;
            }

            System.out.println("in count");
            list.add(count);

            int min = Integer.MAX_VALUE;
            for(int i:arr){

                if(i!=0){
                    if(min>i){
                        min = i;
                    }
                }
            }

            for(int i = 0;i<arr.size();i++){

                if(arr.get(i)!=0){

                    arr.set(i,arr.get(i)-min);
                }
            }

            loop++;

        }
        System.out.println(arr);
        System.out.println(list);
    }
}
