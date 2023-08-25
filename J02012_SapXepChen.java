import java.util.Arrays;
import java.util.Scanner;

public class J02012_SapXepChen {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n+5];
        for (int i = 0 ; i < n; i++) a[i] = cin.nextInt();
        for (int i = 0; i < n; i++) {
            int x = a[i];
            int j = Math.abs(Arrays.binarySearch(a, 0, i, x) + 1);
            System.arraycopy(a, j, a, j + 1, i - j);
            a[j] = x;
            //print
            System.out.print("Buoc " + (int)(i) + ": ");
            for (int p =  0 ; p <= i ; p++) {
                System.out.print(a[p] + " ");
            }
            System.out.println();
        }
    }
}
