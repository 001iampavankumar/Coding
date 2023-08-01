package LeetCode.Strings;
import java.util.*;
public class EqualizeFrequency {

        public static boolean equalFrequency(String word) {


            //i need to create a where i can find the frequency of characters
            HashMap<Character,Integer> freq = new HashMap<>();

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for(int i = 0;i<word.length();i++){

                //this method is tricky
                //we are storing the frequencies of character in string
                freq.put(word.charAt(i),freq.getOrDefault(word.charAt(i),0)+1);

            }

            Set<Character> keys = freq.keySet();

            for(char ch : keys){

                //finding max frequency
                if(max<freq.get(ch)){
                    max = freq.get(ch);
                }

                //finding min frequency
                if(min>freq.get(ch)){
                    min = freq.get(ch);
                }
            }

            System.out.println(min + " === "+ max);

            if(max==min){
                return false;
            }
            return true;

        }

    public static void main(String[] args) {
        String s = "aazz";
        System.out.println(equalFrequency(s));
    }
}
