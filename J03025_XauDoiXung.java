import java.util.*;

public class J03025_XauDoiXung {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t--> 0) {
            String s = cin.next();
            int l = s.length(), cnt = 0;
            for (int i = 0; i < l / 2; i++) {
                if (s.charAt(i) != s.charAt(l - i - 1)) {
                    cnt++;
                }
            }
            if ((l % 2 == 0 && cnt == 1) || (l % 2 == 1 && cnt <= 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
