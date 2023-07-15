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
            int ele = 0;
            for(int i = 0;i<arr.length;i++){

                if(count==0){
                    count = 1;
                    ele = arr[i];
                }
                else if(ele==arr[i]){
                    count++;
                }
                else{
                    count--;
                }
            }

        System.out.println(ele);


        }
}
