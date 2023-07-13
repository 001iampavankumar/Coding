package TapInstacks.Strings.SubStrings;

import java.util.Scanner;

public class SubStringVowelCountEqualOrGreater {

    static int vCount(String s){

        int count = 0;
        for(int i = 0;i<s.length();i++){

            char ch = s.charAt(i);
            if(ch == 'a'||ch=='e'||ch == 'i'||ch=='o' ||ch == 'u'||
                ch=='A'||ch == 'E'||ch=='I' ||ch == 'O'||ch=='U'){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input = "mississippi"
        //output = 4
        String s = scan.nextLine();
        int size = scan.nextInt();

        //two pointer approach
        int i = 0;
        int j = size;
        String t = "";
        while(j<=s.length()){

            for(int k = i;k<j;k++){
                t = t + s.charAt(k);
            }


            //calling vowelcount method to check count is eqaul or greqter
            if(vCount(t)  >=  (t.length()/2) ){
                System.out.println(t);
            }
            t = "";
            i++;
            j++;
        }

    }
}
