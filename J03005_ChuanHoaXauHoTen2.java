import java.util.Scanner;

public class J03005_ChuanHoaXauHoTen2 {
    public static Scanner ip = new Scanner(System.in);

    public static String normalize(String s) {
        if (s.length() == 1) {
            return s.toUpperCase();
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }

    public static void testCase() {
        String line = ip.nextLine().trim();
        String[] arr = line.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = normalize(arr[i]);
        }
        for (int i = 1 ; i < arr.length ; i ++) {

            if (i == arr.length - 1 ) System.out.print(arr[i]+",");
            else System.out.print(arr[i] + " ");
        }
        System.out.print(" " + arr[0].toUpperCase());
        System.out.println();
    }

    public static void main(String[] args) {
        int T = Integer.parseInt(ip.nextLine());
        while (T-- > 0) {
            testCase();
        }
    }
}
