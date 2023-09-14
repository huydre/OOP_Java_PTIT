import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J07058_DanhSachMonThi {
    public static class MonHoc {
        private String Ma, Ten, HinhThucThi;

        public MonHoc(String ma, String ten, String hinhThucThi) {
            this.Ma = ma;
            this.Ten = ten;
            this.HinhThucThi = hinhThucThi;
        }

        public String getMa() {
            return Ma;
        }

        @Override
        public String toString() {
            return Ma + " " + Ten + " " + HinhThucThi;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(cin.nextLine());
        MonHoc[] mh = new MonHoc[n];
        for (int i = 0 ; i < n ; i++) {
            mh[i] = new MonHoc(cin.nextLine(), cin.nextLine(), cin.nextLine());
        }
        Arrays.sort(mh, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        for (int i =0 ; i < n ; i++) {
            System.out.println(mh[i].toString());
        }
    }
}
