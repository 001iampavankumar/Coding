package Companies.PeoulTechnologies;

import java.util.Scanner;

public class ReplaceWordInSentence {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //input
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        String t2 = scan.nextLine();

        //char arrays
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        //char lengths
        int n1 = 0;
        int n2 = 0;

        //finding lengths
        for(char ch:ch1){
            n1++;
        }
        for(char ch:ch2){
            n2++;
        }

        //finding end in order to combine the three strings
        int end = returnEnd(ch1,ch2,n1,n2);

        //empty strings required for combining
        String t1 = "";
        String t3 = "";

        //first part
        for(int i = 0;i<(end-n2);i++){
            t1 = t1 + ch1[i];
        }

        //last part
        for(int i = end;i<n1;i++){
            t3 = t3 + ch1[i];
        }

        //first middle last
        System.out.println(t1 + t2 + t3);
    }

    public static int returnEnd(char[] ch1,char[] ch2,int n1,int n2){

        int i = 0;
        int j = 0;

        while(i<n1){

            while(n2>j && (ch1[i]==ch2[j])){
                i++;
                j++;
            }

            if(j==n2){
                return i;
            }
            else{
                j = 0;
            }

            i++;
        }
        return -1;
    }
}
