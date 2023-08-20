import java.util.Scanner;

public class J01018_SoKhongLienKe {
    public static  String notNextNumber(String s) {
        int cnt = 0;
        for (int i = 0 ; i < s.length() - 1 ; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i+1)) != 2) return "NO";
            cnt += s.charAt(i) -'0';
        }
        cnt += s.charAt(s.length()-1);
        if (cnt % 10 != 0) return "NO";
        return "YES";
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t --> 0) {
            String n = cin.next();
            System.out.println(notNextNumber(n));
        }
    }
}
