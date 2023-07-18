package TapCode.Strings.StringSentence;

import java.util.Scanner;

public class PrintingWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String t = scan.nextLine();

        System.out.println("result: ");
        int start = 0;
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i)!=' '){
                start = i;
                break;
            }
        }
        String s = "";
        for(int i = start;i<t.length()-1;i++){

            if(t.charAt(i)==' '&&t.charAt(i+1)!=' '){

                System.out.println();
                i++;
            }

            if(t.charAt(i)!=' '){
                s = s + t.charAt(i);
            }
        }

        if(t.charAt(t.length()-1)!=' '){
            System.out.println(t.charAt(t.length()-1));
        }
    }
}
