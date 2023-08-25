import java.util.Scanner;

public class J03008_SoDep3 {
    public static boolean isValid(String s) {
        for (int i = 0; i <= s.length()/2; i++) {
            if (s.charAt(i) != '2' && s.charAt(i) != '3' && s.charAt(i) != '5' && s.charAt(i) != '7') return false;
            if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        while (t --> 0) {
            String n = cin.next();
            if (isValid(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
