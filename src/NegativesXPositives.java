import java.util.*;
public class NegativesXPositives {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        int z = 0;
        int nz = 0;

        // 7 4 -2 6 -8 4 9 -3 11 -6

        while(z<arr.length && nz<arr.length-1){


            if(arr[nz]>=0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            }
            else{
                nz++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
