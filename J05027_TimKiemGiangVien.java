import java.util.Scanner;

public class J05027_TimKiemGiangVien {
    public static class GiangVien {
        private String ma, name, nganh;

        public GiangVien(String ma, String name, String nganh) {
            while (ma.length() < 2) ma = "0" + ma;
            this.ma = "GV" + ma;
            this.name = name;
            this.nganh = "";
            String[] s = nganh.toUpperCase().split(" ");
            for (int i = 0; i < s.length; i++) {
                this.nganh += s[i].charAt(0);
            }
        }

        public String getName() {
            return name.toLowerCase();
        }

        @Override
        public String toString() {
            return ma + " " + name + " " + nganh;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GiangVien[] gv = new GiangVien[n];
        for (int i = 0; i < n; i++) {
            gv[i] = new GiangVien(String.valueOf(i+1), sc.nextLine(), sc.nextLine());
        }
        int t = Integer.parseInt(sc.nextLine());
        while (t-->0) {
            String tuKhoa = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tuKhoa + ":");
            for (int i = 0; i < n; i++) {
                if(gv[i].getName().contains(tuKhoa.toLowerCase())){
                    System.out.println(gv[i]);
                }
            }
        }
    }
}