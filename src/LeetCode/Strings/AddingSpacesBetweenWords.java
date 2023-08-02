package LeetCode.Strings;

public class AddingSpacesBetweenWords {

    static String addSpaces(String s,int[] spaces){

        char[] arr = new char[s.length() + spaces.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<s.length()){


            if(j<spaces.length && i==spaces[j]){
                j++;
                arr[k++] = ' ';
            }
            arr[k++] = s.charAt(i);

            i++;
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "LeetcodeHelpsMeLearn";
        int[] spaces = {20};

        System.out.println(addSpaces(s,spaces));
    }
}
