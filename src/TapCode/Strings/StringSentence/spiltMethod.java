package TapCode.Strings.StringSentence;

import java.util.Scanner;

public class spiltMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] str = s.split(" ");

        for(int i = 0;i<str.length;i++){
            System.out.println(str[i]);
        }

    }
}
