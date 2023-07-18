package TapCode.StringArrays;

import java.util.Scanner;
import java.util.TreeSet;

public class SortingWebsites {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
        }
        TreeSet<String> set = new TreeSet<>();
        for(String i : arr){
            set.add(i);
        }
        System.out.println("=====================");
        for(String i : set){

            System.out.println(i);
        }

    }
}
