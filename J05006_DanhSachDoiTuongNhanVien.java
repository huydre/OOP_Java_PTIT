import java.util.Scanner;

public class J05006_DanhSachDoiTuongNhanVien {
    public static class NhanVien {
        private String id;
        private String HoTen, GioiTinh, NgaySinh, DiaChi, MST, NgayKiHopDong;

        public NhanVien(String id, String hoTen, String gioiTinh, String ngaySinh, String diaChi, String MST, String ngayKiHopDong) {
            this.id = id;
            this.HoTen = hoTen;
            this.GioiTinh = gioiTinh;
            this.NgaySinh = ngaySinh;
            this.DiaChi = diaChi;
            this.MST = MST;
            this.NgayKiHopDong = ngayKiHopDong;
        }

        public String getId() {
            while (id.length() < 5) id = "0" + id;
            return id;
        }

        public String getNgaySinh() {
            String[] s = NgaySinh.split("/");
            if(s[0].length() < 2) s[0] = "0" + s[0];
            if(s[1].length() < 2) s[1] = "0" + s[1];
            return s[0] + "/" + s[1] + "/" + s[2];
        }

        public String getNgayKiHopDongh() {
            String[] s = NgayKiHopDong.split("/");
            if(s[0].length() < 2) s[0] = "0" + s[0];
            if(s[1].length() < 2) s[1] = "0" + s[1];
            return s[0] + "/" + s[1] + "/" + s[2];
        }

        @Override
        public String toString() {
            return getId() + " " + HoTen + " " + GioiTinh + " " + getNgaySinh() + " " + DiaChi + " " + MST + " " + getNgayKiHopDongh();
        }

    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());
        NhanVien[] nv = new NhanVien[n+1];
        for ( int i = 1 ; i <= n ; i++) {
            nv[i] = new NhanVien(String.valueOf(i), cin.nextLine(), cin.nextLine(), cin.nextLine(), cin.nextLine(), cin.nextLine(), cin.nextLine());
        }
        for (int i = 1; i <= n ; i++) {
            System.out.println(nv[i].toString());
        }
    }
}
