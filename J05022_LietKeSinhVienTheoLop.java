import java.util.Scanner;

public class J05022_LietKeSinhVienTheoLop {
    public static class SinhVien {
        private String MSV, HoTen, Lop, Email;

        public SinhVien(String msv, String hoTen, String lop, String email) {
            this.MSV = msv;
            this.HoTen = hoTen;
            this.Lop = lop;
            this.Email = email;
        }
        public String getLop() {
            return Lop;
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
            String lop = cin.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP "+lop+ ":");
            for (int j = 0 ; j < n ; j++) {
                if (sv[j].getLop().equals(lop)) System.out.println(sv[j].toString());
            }
        }
    }
}
