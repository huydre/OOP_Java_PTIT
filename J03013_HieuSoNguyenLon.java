import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c = a.subtract(b).abs();

            StringBuilder sb = new StringBuilder(c.toString());
            int maxLen = Math.max(a.toString().length(), b.toString().length());
            while (sb.length() < maxLen) {
                sb.insert(0, '0');
            }
            System.out.println(sb.toString());
        }
    }
}
