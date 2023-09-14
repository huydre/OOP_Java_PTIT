import java.io.File;
import java.io.IOException;
import java.util.*;

public class J07045_LoaiPhong {
    public static class LoaiPhong implements Comparable{
        private String KyHieu, Ten, DonGia, PhiDichVu;

        public LoaiPhong(String s) {
            String[] arr = s.split(" ");
            this.KyHieu = arr[0];
            this.Ten = arr[1];
            this.DonGia = arr[2];
            this.PhiDichVu = arr[3];
        }

        public String getTen() {
            return Ten;
        }

        @Override
        public String toString() {
            return KyHieu + " " + Ten + " " + DonGia + " " + PhiDichVu;
        }

        @Override
        public int compareTo(Object obj) {
            LoaiPhong lp = (LoaiPhong) obj;
            return Ten.compareTo(lp.getTen());
        }
    }
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
