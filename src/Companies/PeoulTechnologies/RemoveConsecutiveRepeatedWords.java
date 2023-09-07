package Companies.PeoulTechnologies;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveConsecutiveRepeatedWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        //using set because duplicates are not alllwed
        LinkedHashSet<String> set = new LinkedHashSet<>();

        //setting up  char array
        char[] ch = s.toCharArray();

        //length
        int n = 0;

        //finding length
        for(char c : ch){
            n++;
        }

        //Words assigning to set
        //temporary string
        String t = "";

        //finding words through traversal
        for(int i = 0;i<n-1;i++){
            if(ch[i]!=' '){
                t = t + ch[i];
            }
            if(ch[i]!=' '&&ch[i+1]==' '){
                set.add(t);
                t = "";
            }
        }

        //if temp string is not empty then add lastString character to temp
        if(t!=""){
            t = t + ch[n-1];
            set.add(t);
        }

        //printing the result string
        for(String res:set){
            System.out.print(res+" ");
        }
    }
}
