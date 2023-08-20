import java.util.Scanner;

public class J01026_SoChinhPhuong {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while(t --> 0) {
            int n = cin.nextInt();
            int a = (int)Math.sqrt(n);
            if (a*a == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
