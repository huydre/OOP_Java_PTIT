import java.util.*;

public class J01011_BoiSoChung_UocSoChung {
    static long gcd(long a, long b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    static long lcm(long a, long b) {
        return a*b/gcd(a,b);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        while ( t --> 0)
        {
            long a = cin.nextInt();
            long b = cin.nextInt();

            System.out.println(lcm(a,b) + " " + gcd(a,b));
        }
    }
}
