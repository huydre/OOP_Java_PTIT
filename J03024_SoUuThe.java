import java.util.Scanner;

public class J03024_SoUuThe {
    public static String is_valid(String s) {
        int cnt = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            if ((int)(s.charAt(i) - '0') % 2 == 0) cnt++;
            if (s.charAt(i) > '9' || s.charAt(i) < '0') return "INVALID";
        }
        if (s.length() - cnt == cnt) return "NO";
        if (cnt % 2 == 0 && cnt > s.length() - cnt || cnt % 2 == 1 && cnt < s.length() - cnt) return "YES";
        return "NO";

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while(t --> 0) {
            String s = cin.nextLine();
            System.out.println(is_valid(s));
        }
    }
}
