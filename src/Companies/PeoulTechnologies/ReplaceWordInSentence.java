package Companies.PeoulTechnologies;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //input
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String res = scan.nextLine();



        //setting up char array
        char[] ch = s1.toCharArray();

        //length
        int n = 0;

        //finding length
        for (char c : ch) {
            n++;
        }


        //creating string with the help of count method
        String[] arr = new String[count(ch, n)];

        //empty string
        String t = "";

        //string array index to zero at first
        int stringIndex = 0;

        //adding words to stirng using temp string
        for (int i = 0; i < n - 1; i++) {
            if (ch[i] != ' ') {
                t = t + ch[i];
            }
            if (ch[i] != ' ' && ch[i + 1] == ' ') {
                arr[stringIndex++] = t;
                t = "";
            }
        }

        //if temp is not empty then add lastString Character to temp
        if (t != "") {
            t = t + ch[n - 1];
            arr[stringIndex] = t;
        }

        //finding the length of string array
        int length = count(ch,n);

        //comparing the strings with given string
        for(int i = 0;i<length;i++){

            //we can't use "==" so i wrote a function to compare strings
            if(sameOrNot(arr[i],s2)){
                arr[i]=res;
            }
        }

        //printing the result
        for(String st : arr){
            System.out.print(st+" ");
        }



    }
    public static boolean sameOrNot(String s, String t) {
        int n1 = 0;
        int n2 = 0;

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        for (char c : ch1) {
            n1++;
        }

        for (char c : ch2) {
            n2++;
        }

        if (n1 != n2) {
            return false;
        }

        for (int i = 0; i < n1; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }

    public static int count(char[] ch, int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ch[i] != ' ' && ch[i + 1] == ' ') {
                count++;
            }
        }
        if (ch[n - 1] != ' ') {
            count++;
        }
        return count;
    }

}
