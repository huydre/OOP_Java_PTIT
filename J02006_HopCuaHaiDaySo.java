import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J02006_HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int m = cin.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        for (int i = 0 ; i < n ; i++) {
            set1.add(cin.nextInt());
        }
        for (int i = 0 ; i < m ; i++) {
            set1.add(cin.nextInt());
        }
        Iterator i = set1.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
