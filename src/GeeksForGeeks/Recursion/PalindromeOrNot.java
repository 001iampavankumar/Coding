package GeeksForGeeks.Recursion;

import java.util.Scanner;
public class PalindromeOrNot {




    static boolean isPalindrome(String s,int start,int end){


        if(start>end){
            return true;
        }
        else{
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
        }
        return isPalindrome(s,start+1,end-1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        if(isPalindrome(s,0,s.length()-1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
