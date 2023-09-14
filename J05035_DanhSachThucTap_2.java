import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05035_DanhSachThucTap_2 {
    public static class SinhVien {
        private int num;
        private String ma, name, lop, email, doanhNghiep;

        public SinhVien(int num, String ma, String name, String lop, String email, String doanhNghiep) {
            this.num = num;
            this.ma = ma;
            this.name = name;
            this.lop = lop;
            this.email = email;
            this.doanhNghiep = doanhNghiep;
        }

        public String getName() {
            return name;
        }

        public String getMa() {
            return ma;
        }

        public String getDoanhNghiep() {
            return doanhNghiep;
        }

        @Override
        public String toString() {
            return num + " " + ma + " " + name + " " + lop + " " + email + " " + doanhNghiep;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sv[i] = new SinhVien(i+1,cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine(),cin.nextLine());
        }
        Arrays.sort(sv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.ma.compareTo(o2.ma);
            }
        });
        int q = Integer.parseInt(cin.nextLine());
        for (int i = 0 ; i < q ; i++) {
            String doanhNghiep = cin.nextLine();
            for (int j = 0 ; j < n ; j++) {
                if (sv[j].getDoanhNghiep().equals(doanhNghiep)) System.out.println(sv[j].toString());
            }
        }
    }
}
