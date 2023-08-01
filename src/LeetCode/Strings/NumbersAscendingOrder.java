package LeetCode.Strings;
import java.util.*;
public class NumbersAscendingOrder {
    public static boolean areNumbersAscending(String s) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {


            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {

                int j = i + 1;
                String t = "" + s.charAt(i);
                while ((j < s.length()) && (s.charAt(j) >= '0' && s.charAt(j) <= '9')) {

                    t = t + s.charAt(j);
                    i++;
                    j++;
                }

                list.add(Integer.parseInt(t));
            }

        }

        for(int i = 0;i<list.size()-1;i++){

            if(list.get(i+1)<=list.get(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        System.out.println(areNumbersAscending(s));
    }
}
