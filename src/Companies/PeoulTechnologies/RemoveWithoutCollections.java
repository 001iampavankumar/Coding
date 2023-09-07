package Companies.PeoulTechnologies;

import java.util.Scanner;

public class RemoveWithoutCollections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        //setting up char array
        char[] ch = s.toCharArray();

        //length
        int n = 0;

        //finding length
        for(char c : ch){
            n++;
        }

        //creating string with the help of count method
        String[] arr = new String[count(ch,n)];

        //empty string
        String t = "";

        //string array index to zero at first
        int stringIndex = 0;

        //adding words to stirng using temp string
        for(int i = 0;i<n-1;i++){
            if(ch[i]!=' '){
                t = t + ch[i];
            }
            if(ch[i]!=' '&&ch[i+1]==' '){
                arr[stringIndex++] = t;
                t = "";
            }
        }

        //if temp is not empty then add lastString Character to temp
        if(t!=""){
            t = t + ch[n-1];
            arr[stringIndex] = t;
        }

        //printing the result string
        for(String res:arr){
            System.out.print(res+" ");
        }
    }

    public static int count(char[] ch,int n){
        int count = 0;
        for(int i = 0;i<n-1;i++){

            if(ch[i]!=' '&&ch[i]==' '){
                count++;
            }
        }
        if(ch[n-1]!=' '){
            count++;
        }
        return count;
    }
}
