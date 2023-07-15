package LeetCode.Favorite;
import java.util.Scanner;
public class MajorityElement {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            int count = 0;
            int ele = -1;
            for(int i = 0;i<arr.length-1;i++){

                if(count==0){
                    ele = arr[i];
                }
                else if(arr[i]==arr[i+1]){
                    count++;
                }
                else{
                    count--;
                }
            }
            if(count=0){
                ele = arr[arr.length-1];
            }

        System.out.println(ele);


        }
}
