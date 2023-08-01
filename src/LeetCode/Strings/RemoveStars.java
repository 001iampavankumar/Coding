package LeetCode.Strings;
import java.util.*;

public class RemoveStars {

    static String reducedString(String s){

        LinkedList<Character> arr = new LinkedList<>();

        for(int i = 0;i<s.length();i++){

            arr.add(s.charAt(i));
        }

        removeStars(arr);
        StringBuilder b = new StringBuilder();
        for(char ch : arr){
            b.append(ch);
        }
        return b.toString();
    }

    static void removeStars(LinkedList<Character> arr){

//        System.out.println(arr);
//        System.out.println(arr+" fuck");
        if(arr.size()<0){
            return;
        }
       // System.out.println(arr+" fuck2");



        for(int i = 1;i<arr.size();i++){

            if(arr.size()==2){
                if(arr.get(0)!='*' && arr.get(1)=='*'){
                    arr.clear();
                    return;
                }
            }

            if(arr.get(i-1)=='*'){
                arr.remove(i-1);
                break;
            }

            if(arr.get(i)=='*'){

                arr.remove(i);

                arr.remove(i-1);
                break;

            }
        }


        if(arr.get(0)=='*'){
            arr.remove(0);
        }


        //System.out.println(arr);


        // this is for confirmation
        boolean b = false;
        for(int i = 0;i<arr.size();i++){

            if(arr.get(i)=='*'){
                b = true;
                break;
            }
        }

        if(b==true){
            removeStars(arr);
        }
        else{
            return;
        }



    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(reducedString(s));

    }
}
