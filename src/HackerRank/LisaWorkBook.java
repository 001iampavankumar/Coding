package HackerRank;
import java.util.Scanner;
public class LisaWorkBook {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("No of questions : ");
        int k = scan.nextInt();
        System.out.println("Elements: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int sp = 0;
        int chap = 1;

        for(int i = 0;i<arr.length;i++){

            int j = 1;
            while(j<arr[i]) {

                if (chap == j) {
                    sp++;
                    //System.out.println("chap : " + chap + " ===== " + "j : ====== " + j + " =========== sp : " + sp);

                }

                if (j % k == 0) {

                    //System.out.println("chap : ===== "+chap+" ===== "+ arr[i]);
                    chap++;
                }

                j++;
            }
            if (chap == j) {
                sp++;
                //System.out.println("chap : " + chap + " ===== " + "j : ====== " + j + " =========== sp : " + sp);

            }
            //System.out.println("chap : ===== "+chap+" ===== "+ arr[i]);
            chap++;
        }

        //System.out.println("chapters: "+chap);
        System.out.println("special: "+sp);

    }
}
