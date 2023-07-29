package HackerRank;

import java.util.HashSet;
import java.util.Scanner;

public class Password {

    public static int minimumNumber(String password) {
        // Return the minimum number of characters to make the password strong


        HashSet<Character> num = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> special = new HashSet<>();


        HashSet<Character> s = new HashSet<>();
        String SC = "!@#$%^&*()_-+";
        for(int i = 0;i<SC.length();i++){

            s.add(SC.charAt(i));
        }
        for(int i = 0;i<password.length();i++){

            char ch = password.charAt(i);

            if(ch>='0'&&ch<='9'){
                num.add(ch);
            }
            else if(ch>='a'&&ch<='z'){
                lower.add(ch);
            }
            else if(s.contains(ch)){
                special.add(ch);
            }
            else if(ch>='A'&&ch<='Z'){
                upper.add(ch);
            }
        }

        int count = 0;

        if(num.size()==0){
            System.out.println("num");
            count = count +1;
        }
        if(lower.size()==0){
            System.out.println("lower");
            count = count + 1;
        }
        if(upper.size()==0){
            System.out.println("upper");
            count = count +1;
        }
        if(special.size()==0){
            System.out.println("special");
            count = count + 1;
        }

        if(password.length()>=6){
            System.out.println("res");
            return count;
        }

        if((password.length()+count)<6){
            int rem = 6 - (password.length()+count);
            System.out.println(6 +" - "+password.length()+" - "+count+" = "+(rem));

            return count+rem;
        }

        return count;


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(minimumNumber(s));

    }
}
