import java.util.Scanner;

public class J03017_LoaiBo100 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            String n = cin.next();
            String m = n;
            while (n.contains("100")) {
                n = n.replace("100","");
            }
            System.out.println(m.length() - n.length());
        }
    }
}
