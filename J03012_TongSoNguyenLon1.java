import java.math.BigInteger;
import java.util.Scanner;

public class J03012_TongSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0 ) {
            BigInteger a = cin.nextBigInteger();
            BigInteger b = cin.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}
