package TapCode.Favorite;
import java.util.Scanner;
public class SimplifyFraction {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        if(n%m==0){
            System.out.println(n/m+"/"+1);
            return;
        }

        int hcf = 1;

        for(int i = n;i>0;i--){

            if(n%i==0 && m%i==0){
                hcf = i;
                break;
            }
        }

        while(hcf!=1){

            n = n/hcf;
            m = m/hcf;

            for(int i = n;i>0;i--){

                if(n%i==0&&m%i==0){
                    hcf = i;
                    break;
                }
            }
        }

        System.out.println(n+"/"+m);

    }
}
