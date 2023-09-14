import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05009_TimThuKhoaCuaKyThi {
    public static class ThiSinh {
        private String id, Ten, NgaySinh;
        private double Diem1, Diem2, Diem3;

        public ThiSinh(String id, String ten, String ngaySinh, double diem1, double diem2, double diem3) {
            this.id = id;
            this.Ten = ten;
            this.NgaySinh = ngaySinh;
            this.Diem1 = diem1;
            this.Diem2 = diem2;
            this.Diem3 = diem3;
        }

        public String getId() {
            return id;
        }

        public String getTongDiem() {
            double ans =  Diem1 + Diem2 + Diem3;
            return String.format("%.1f",ans);
        }

        @Override
        public String toString() {
            return id + " " + Ten + " " + NgaySinh + " " + getTongDiem();
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = Integer.parseInt(cin.nextLine());
        ThiSinh[] ts = new ThiSinh[n];
        for (int i = 0 ; i < n ; i++) {
            ts[i] = new ThiSinh(String.valueOf(i+1), cin.nextLine(), cin.nextLine(),  Double.parseDouble(cin.nextLine()), Double.parseDouble(cin.nextLine()),
                    Double.parseDouble(cin.nextLine()));
        }
        Arrays.sort(ts, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if(o1.getTongDiem().equals(o2.getTongDiem())) {
                    return o1.getId().compareTo(o2.getId());
                }else {
                    return -o1.getTongDiem().compareTo(o2.getTongDiem());
                }
            }
        });
        System.out.println(ts[0]);
        for (int i = 1 ; i < n ; i++) {
            if(ts[i].getTongDiem().equals(ts[i-1].getTongDiem())) {
                System.out.println(ts[i]);
            } else {
                break;
            }
        }
    }
}
