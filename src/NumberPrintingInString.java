import java.util.*;
public class NumberPrintingInString {


    static List<Integer> numbers(String s){


        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<s.length();i++){


            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){

                int j = i+1;
                String t = "" + s.charAt(i);
                System.out.println("index: "+i);
                while((j<s.length())&&(s.charAt(j)>='0'&&s.charAt(j)<='9')){

                    t = t + s.charAt(j);
                    System.out.println("index : "+ i);
                    i++;
                    j++;
                }

                list.add(Integer.parseInt(t));
            }

        }
        return list;
    }
    public static void main(String[] args) {
        String s = "5x5x5x5x5x5";

        System.out.println(numbers(s));
    }
}
