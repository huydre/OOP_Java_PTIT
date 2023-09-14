import java.util.Scanner;

public class J05036_TinhGiaBan_1 {
    public static class MatHang {
        private String Ma,Ten,DonViTinh;
        private long SoLuong,PhiVanChuyen,DonGiaNhap,ThanhTien,GiaBan;

        public MatHang(String ma, String ten, String donViTinh, long donGiaNhap, long soLuong) {
            this.Ma = ma;
            this.Ten = ten;
            this.DonViTinh = donViTinh;
            this.DonGiaNhap = donGiaNhap;
            this.SoLuong = soLuong;
            setPhiVanChuyen();
            setThanhTien();
            eetGiaBan();
        }

        public String getMa() {
            String ma = Ma;
            while (ma.length() < 2) ma = "0" + ma;
            return "MH"+ma;
        }

        public void setPhiVanChuyen() {
            this.PhiVanChuyen =  Math.round((DonGiaNhap*SoLuong)*0.05);
        }

        public void setThanhTien() {
            this.ThanhTien = DonGiaNhap*SoLuong+PhiVanChuyen;
        }

        public void eetGiaBan() {
            this.GiaBan = ThanhTien + Math.round(ThanhTien*0.02);
        }

        @Override
        public String toString() {
            return getMa() + " " + Ten + " " + DonViTinh + " " + PhiVanChuyen + " " + ThanhTien + " " + GiaBan;
        }
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());
        MatHang[] mh = new MatHang[n];
        for (int i = 0 ; i < n ; i++) {
            mh[i] = new MatHang(String.valueOf(i+1), cin.nextLine(),cin.nextLine(), Long.parseLong(cin.nextLine()), Long.parseLong(cin.nextLine()));
        }
        for (int i = 0 ; i < n ; i++) {
            System.out.println(mh[i].toString());
        }
    }
}
