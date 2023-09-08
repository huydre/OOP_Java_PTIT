import java.util.HashSet;
import java.util.Scanner;

public class J03009_TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            String[] s1 = cin.nextLine().split("\\s+");
            String s2 = cin.nextLine();
            HashSet<String> set = new HashSet<>();
            for (String i: s1) {
                if ( !s2.contains(i)) set.add(i);
            }
            for (String i:set) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
