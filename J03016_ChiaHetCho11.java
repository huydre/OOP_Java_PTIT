import java.math.BigInteger;
import java.util.Scanner;

public class J03016_ChiaHetCho11 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            BigInteger n = cin.nextBigInteger();
            System.out.println(n.mod(new BigInteger("11")).equals(BigInteger.ZERO) ? "1" : "0");
        }
    }
}
