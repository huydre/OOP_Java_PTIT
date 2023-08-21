import java.util.*;

public class J02010_SapXepDoiChoTrucTiep {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n+5];
        for (int i = 0 ; i < n ; i++) {
            a[i] = cin.nextInt();
        }

        for (int i = 0 ; i < n-1 ; i++) {
            for (int j = i+1 ; j < n ; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.format("Buoc %d: ", i+1);
            for (int j = 0 ; j < n ; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
