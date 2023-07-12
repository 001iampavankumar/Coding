package TapInstacks.Strings.StringSentence;

import java.util.Scanner;

public class SentenceReverse {
    static String subStr(String s,int start,int end){
        String t = "";
        for(int i = start;i<=end;i++){
            t = t + s.charAt(i);
        }
        return t;
    }
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
    static String[] storeWords(String s){
        String[] str = new String[countWords(s)];

        int i = 0;
        int j = 0;
        int loop = 0;

        while(j<s.length()-1){

            if(s.charAt(i)==' '){
                i++;
                j++;
            }

            if(s.charAt(j)!=' '&& s.charAt(j+1)==' '){
                //System.out.println(subStr(s,i,j));
                str[loop++] = subStr(s,i,j);
            }

            if(s.charAt(j)==' '&&s.charAt(j+1)!=' '){
                i = j+1;
            }

            j++;
        }

        if(s.charAt(s.length()-1)!=' '){
            //System.out.println(subStr(s,i,j));
            str[loop++] = subStr(s,i,j);
        }

        return str;

    }

    static String reverse(String s){
        String t = "";
        for(int i = s.length()-1;i>=0;i--){
            t = t + s.charAt(i);
        }
        return t;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //input = "india is my country"
        //output = "country my is india"
        String s = scan.nextLine();
        String [] str = storeWords(s);
        String t = "";
        for(int i = str.length - 1;i>=0;i--){

            t = t + str[i]+ " ";
        }
        System.out.println(t);
    }
}
