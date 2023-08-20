import java.util.Scanner;

public class J01017_SoLienKe {
    public  static Boolean nextNumber(String s) {
        for (int i = 0 ; i < s.length()-1 ; i++) {
            if ( Math.abs(s.charAt(i) - s.charAt(i+1)) != 1) return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t--> 0) {
            String s = cin.next();
            if (nextNumber(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
