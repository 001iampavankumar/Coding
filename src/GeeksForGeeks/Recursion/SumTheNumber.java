package GeeksForGeeks.Recursion;

import java.util.Scanner;

public class SumTheNumber {


    static int sumNum(int n){

        if(n==0){
            return 0;
        }
        int rem = n%10;
        return rem + sumNum(n/10);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(sumNum(n));
    }
}
