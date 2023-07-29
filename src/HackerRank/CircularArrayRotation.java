package HackerRank;
import java.util.*;
public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
        // Write your code here


        int rotate = k%a.size();

        for(int i = 0 ;i<rotate;i++){

            int temp = a.get(a.size()-1);
            a.remove(a.size()-1);
            a.add(0,temp);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i : queries){

            list.add(a.get(i));
        }

        return list;

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
