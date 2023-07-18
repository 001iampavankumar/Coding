package TapCode.Strings;
import java.util.*;
public class SortingWebsites {

    static int countWords(String s){

        int count = 1;
        int i = 0;
        while(i<s.length()-1){
            if(s.charAt(i)==','){
                count++;
            }
            i++;
        }

        return count;
    }

    static String[] storeWords(String s){
        String[] arr = new String[countWords(s)];

        int i = 0;
        int j = 0;
        String t = "";
        while(i<s.length()){

            if(s.charAt(i)!=','){
                t = t + s.charAt(i);
            }
            else if(t!=""){
                arr[j++] = t;
                t = "";

            }
            i++;
        }
        if(t!=""){
            arr[j] = t;
        }

        return arr;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.next();

        String[] arr = storeWords(s);

        TreeSet<String> set = new TreeSet<>();

        for(String t : arr){
            set.add(t);
        }
        System.out.println("======================");
        for(String m : set){
            System.out.println(m);
        }
    }

}
