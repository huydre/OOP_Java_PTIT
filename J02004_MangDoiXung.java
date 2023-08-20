import java.util.Scanner;

public class J02004_MangDoiXung {
    public static String doiXung(int[] a, int n) {
        for (int i = 0 ; i <= n/2 ; i++) {
            if (a[i] != a[n-i-1]) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t --> 0) {
            int n = cin.nextInt();
            int[] a = new int[n+5];
            for (int i = 0 ; i < n ; i++) {
                a[i] = cin.nextInt();
            }
            System.out.println(doiXung(a,n));
        }
    }
}
