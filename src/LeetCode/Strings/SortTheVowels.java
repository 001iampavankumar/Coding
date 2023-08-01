package LeetCode.Strings;
import java.util.*;
public class SortTheVowels {

    public static String sortVowels(String s) {

        char[] arr = s.toCharArray();

        ArrayList<Character> list = new ArrayList<>();


        for(char ch : arr){

            if(isVowel(ch)){
                list.add(ch);
            }
        }

        System.out.println(list);
        Collections.sort(list);

        System.out.println(list);

        StringBuilder b = new StringBuilder();

        int i = 0;
        for(char ch : arr){

            if(isVowel(ch)){

                b.append(list.get(i++));
                continue;
            }

            b.append(ch);
        }

        return b.toString();

    }

    static boolean isVowel(char ch){

        if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')){

            return true;
        }

        return false;
    }
    public static void main(String[] args) {

        String s = "LehjdsI";
        System.out.println(sortVowels(s));
    }
}
