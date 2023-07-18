package TapCode.Strings.StringSentence;

import java.util.Scanner;

public class NextInputSentence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i = 0;i<str.length;i++){
            str[i] = scan.next();
        }
    }
}
