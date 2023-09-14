import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07002_TinhTong {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(new File("DATA.in"));
        long sum = 0;
        while(cin.hasNext()) {
            try {
                int x = Integer.parseInt(cin.next());
                sum += x;
            }
            catch (NumberFormatException e) {
            }
        }
        System.out.println(sum);
    }
}
