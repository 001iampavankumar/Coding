package TapInstacks.Strings.StringSentence;

import java.util.Scanner;

public class CountWords {


    static int countWords(String s){
        int count = 0;
        //counting in string
        for(int i = 0;i<s.length()-1;i++){

            //current char is not space and next is space we conclude its a word.
            if(s.charAt(i)!=' '&&s.charAt(i+1)==' '){
                count++;
            }
        }

        //if there is no space in the end, we have to increment the count.
        if(s.charAt(s.length()-1)!=' '){
            return count+1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input = "india is my country"
        //output = 4
        String s = scan.nextLine();

        System.out.println(countWords(s));
    }
}
