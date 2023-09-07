package TapCode.MockAssesment;
import java.util.*;

public class longestSubArrayWithEqualzeroandone {

    static void longest(int[] arr) {

        int max = 0;
        int count = 0;
        int zc = 0;
        int oc = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                zc = 0;
                oc = 0;
                count = 0;
                for (int k = i; k <= j; k++) {

                   if(arr[k]==1){
                       oc++;
                       count++;
                   }
                   else if(arr[k]==0){
                       zc++;
                       count++;
                   }
                   else{
                       break;
                   }
                }

                if (zc == oc && zc > 0 && oc > 0) {

                    if (max < count) {

                        max = count;
                    }
                }
            }
        }

        System.out.println(max);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = {9,0,9,1,0,1,0,8,0,1,1,1,1,1,1,1,1};

        longest(arr);
    }
}
