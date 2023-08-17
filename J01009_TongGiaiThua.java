import java.util.Scanner;

public class J01009_TongGiaiThua {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        long n = cin.nextLong();
        long sum = 0, gt = 1;
        for (long i = 1 ; i <= n ; i++) {
            gt *= i;
            sum += gt;
        }
        System.out.println(sum);
    }
}
