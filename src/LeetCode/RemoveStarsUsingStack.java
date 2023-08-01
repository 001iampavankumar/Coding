package LeetCode;
import java.util.*;
public class RemoveStarsUsingStack {


    static String removeStars(String s){

        StringBuilder b = new StringBuilder();

        for(int i = 0,j = -1;i<s.length();i++){

            if(s.charAt(i)!='*'){
                b.append(s.charAt(i));
                j++;
            }


            else if(s.charAt(i)=='*'){

                if(j==-1){
                    continue;
                }
                else{
                    b.deleteCharAt(j);
                    j--;
                }
            }
        }



        return b.toString();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s  = scan.next();

        System.out.println(removeStars(s));
    }
}
