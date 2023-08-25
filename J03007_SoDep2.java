import java.util.Scanner;

public class J03007_SoDep2 {
    public static boolean isValid(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum % 10 == 0;
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
