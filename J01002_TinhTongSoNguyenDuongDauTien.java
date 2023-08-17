import java.util.Scanner;

public class J01002_TinhTongSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        for (int p = 0 ; p < t ; p++)
        {
            long n = cin.nextLong();
            long res = n*(n+1)/2;

            System.out.println(res);
        }
    }
}
