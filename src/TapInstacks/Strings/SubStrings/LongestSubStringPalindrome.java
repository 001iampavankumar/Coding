package TapInstacks.Strings.SubStrings;
import java.util.Scanner;
public class LongestSubStringPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input = "mississippi"
        //output = "ississi"
        String s = scan.nextLine();

        //Mcount to keep track of longest subString
        int Mcount = 0;

        //longpali to keep storing of substing
        String longPali = "";

        for(int i = 0;i<s.length();i++){

            for(int j = i;j<s.length();j++){


                //t1 and t2 is used to check palindrme or not;
                String t1 = "";
                String t2 = "";
                for(int k = i,l = j;k<=j;k++,l--) {


                    t1 = t1 + s.charAt(k);
                    t2 = t2 + s.charAt(l);

                }


                //if palindrome means check longest
                if(t1.equals(t2)){
                    if(Mcount<t1.length()){
                        Mcount = t1.length();
                        longPali = t1;
                    }
                }
            }
        }

        System.out.println(longPali);

    }
}
