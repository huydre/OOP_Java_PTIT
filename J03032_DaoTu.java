import java.util.*;

public class J03032_DaoTu {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            String s = cin.nextLine();
            String[] str = s.split(" ");
            for (String string : str) {
                StringBuilder s1 = new StringBuilder();
                System.out.print(s1.append(string).reverse() + " ");
            }
            System.out.println();
        }
    }
}
