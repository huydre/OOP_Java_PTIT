import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class J07021_ChuanHoaXauHoTenTrongFile {
    public static String normalize(String s) {
        if (s.length() == 1) {
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("DATA.in"));
        while (cin.hasNextLine()) {
            String s = cin.nextLine();
            if (!s.equals("END")) {
                String[] arr = s.trim().split("\\s+");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = normalize(arr[i]);
                }
                System.out.println(String.join(" ", arr));
            }
        }
    }
}
