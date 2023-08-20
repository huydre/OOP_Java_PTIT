import java.util.*;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n,m;
        n = cin.nextInt();
        m = cin.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new TreeSet<>();
        for (int i = 0 ; i < n ; i++) {
            set1.add(cin.nextInt());
        }
        for (int i = 0 ; i < m ; i++) {
            set2.add(cin.nextInt());
        }
        for (int i:set1) {
            if (set2.contains(i)) System.out.print(i + " ");
        }
    }
}
