import java.util.Scanner;

public class J05023_LietKeSinhVienTheoKhoa {
    public static class SinhVien {
        private String MSV, HoTen, Lop, Email;

        public SinhVien(String msv, String hoTen, String lop, String email) {
            this.MSV = msv;
            this.HoTen = hoTen;
            this.Lop = lop;
            this.Email = email;
        }

        public String getKhoa() {
            return Lop.substring(1,3);
        }
        @Override
        public String toString() {
            return MSV + " " + HoTen + " " + Lop + " " + Email;
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());
        SinhVien[] sv = new SinhVien[n];
        for (int i = 0 ; i < n ; i++) {
            sv[i] = new SinhVien(cin.nextLine(), cin.nextLine(), cin.nextLine(), cin.nextLine());
        }
        int q = Integer.parseInt(cin.nextLine());
        for (int i = 0 ; i < q ; i++) {
            String khoa = cin.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA "+khoa+ ":");
            for (int j = 0 ; j < n ; j++) {
                if (sv[j].getKhoa().equals(khoa.substring(2,4))) System.out.println(sv[j].toString());
            }
        }
    }
}
