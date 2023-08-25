import java.math.BigInteger;
import java.util.Scanner;

public class J03011_UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while ( t --> 0) {
            BigInteger a = new BigInteger(cin.nextLine());
            BigInteger b = new BigInteger(cin.nextLine());
            System.out.println(a.gcd(b));
        }
    }
}
