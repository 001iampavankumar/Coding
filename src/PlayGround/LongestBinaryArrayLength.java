package PlayGround;
import java.util.*;
public class LongestBinaryArrayLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        //calling function

        System.out.println("length: "+longestBinaryMatches(arr));

    }

    public static int longestBinaryMatches(int[] arr){

        int max = 0;
        int count = 0;
        int zero = -1;
        int one = -1;

        for(int i = 0;i<arr.length;i++){

            for(int j = i;j<arr.length;j++){

                count = 0;
                zero = 0;
                one = 0;

                for(int k = i;k<=j;k++){

                    if(arr[k]==1){
                        one++;
                        count++;
                    }
                    else if(arr[k]==0){
                        zero++;
                        count++;
                    }
                }

                if(zero==one){

                    if(max<count){
                        max = count;
                    }
                }
            }
        }

        return max;
    }
}
