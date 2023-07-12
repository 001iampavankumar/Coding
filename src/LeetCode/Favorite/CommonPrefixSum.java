package LeetCode.Favorite;

import java.util.Scanner;

public class CommonPrefixSum {

    static String commonPrefix(String[] strs) {
        String mS = strs[0];
        String sS = strs[0];
        for (int i = 0; i < strs.length; i++) {
            int v1 = mS.compareTo(strs[i]);
            int v2 = sS.compareTo(strs[i]);

            if (v1 < 0) {
                mS = strs[i];
            }

            if (v2 > 0) {
                sS = strs[i];
            }
        }

        int i = 0;
        String res = "";
        while (i < mS.length() && i < sS.length()) {

            if (mS.charAt(i) != sS.charAt(i)) {
                break;
            }

            i++;

        }

        return mS.substring(0, i);
    }

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] sArr = new String[n];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = scan.nextLine();
        }

        System.out.println(commonPrefix(sArr));

    }


}

//My Thoughts:
//
//        Intuition:
//        First i thought to compare all the strings in the array in order to find the common prefix string.
//
//        i figure out brute force approach but it couldn't handle all the test cases
//
//        Approach:
//        i thought of finding the smallest and largest string in array by using (compareTo) operator.
//        after finding them i just took i as index and iterate through while loop to check the common
//        charcters until the length of any string.
//
//        then i have the last index of common prefix.
//
//        so in the end i returned the sub string (0,i);
//
//        Time complexity:
//        o(n + m);
//
//        n is the length of array
//        m is the length of string in array
//
//        Space complexity:
//        0(1);

