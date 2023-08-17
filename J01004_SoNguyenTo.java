import java.util.Scanner;

public class J01004_SoNguyenTo {
    static boolean isPrime(long n)
    {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        for (int p = 0 ; p < t ; p++)
        {
            long n = cin.nextLong();
            if (isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
