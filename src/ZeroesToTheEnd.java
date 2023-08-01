import java.util.*;

public class ZeroesToTheEnd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }


        int z = 0;
        int nz = 0;

        while(z<arr.length && nz<arr.length){


            if(arr[nz]!=0){

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
