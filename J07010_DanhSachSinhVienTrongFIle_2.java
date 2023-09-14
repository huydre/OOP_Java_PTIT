import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07010_DanhSachSinhVienTrongFIle_2 {
    public static class SinhVien {
        private String Ma, HoTen, Lop, NgaySinh;
        private float GPA;

        public SinhVien(String ma, String hoTen, String lop, String ngaySinh, float GPA) {
            this.Ma = ma;
            this.HoTen = hoTen;
            this.Lop = lop;
            this.NgaySinh = ngaySinh;
            this.GPA = GPA;
        }

        public String getNgaySinh() {
            String[] s = NgaySinh.split("/");
            while (s[0].length() < 2) s[0] = "0" + s[0];
            while (s[1].length() < 2) s[1] = "0" + s[1];
            while (s[2].length() < 4) s[2] = "0" + s[2];
            return s[0] + "/" + s[1] + "/" + s[2];
        }

        public String getMa() {
            String s = Ma;
            while (s.length() < 3) s = "0" + s;
            return "B20DCCN" + s;
        }

        @Override
        public String toString() {
            return getMa() + " " + HoTen + " " + Lop + " " + getNgaySinh() + " " + String.format("%.2f",GPA);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(new File("SV.in"));
        int n = Integer.parseInt(cin.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sv[i] = new SinhVien(String.valueOf(i+1), cin.nextLine(), cin.nextLine(), cin.nextLine(), Float.parseFloat(cin.nextLine()));
        }
        for (int i =0 ; i < n ; i++) {
            System.out.println(sv[i].toString());
        }

    }
}
