import java.util.Scanner;

public class J04018_SoPhuc {
    public static class SoPhuc {
        private int thuc,ao;

        public SoPhuc(int thuc, int ao) {
            this.thuc = thuc;
            this.ao = ao;
        }

        public int getThuc() {
            return this.thuc;
        }

        public void setThuc(int a) {
            this.thuc = a;
        }

        public int getAo() {
            return this.ao;
        }

        public void setAo(int a) {
            this.ao = a;
        }
        public SoPhuc mul(SoPhuc soPhuc) {
            int a = thuc * soPhuc.getThuc() - ao * soPhuc.getAo();
            int b = thuc * soPhuc.getAo() + ao * soPhuc.getThuc();
            return new SoPhuc(a,b);
        }

        public SoPhuc add(SoPhuc soPhuc) {
            int a = thuc + soPhuc.getThuc();
            int b = ao + soPhuc.getAo();
            return new SoPhuc(a,b);
        }

        @Override
        public String toString() {
            String ans = "";
            if ( ao <0) {
                ans = String.format("%d - %di",thuc,-ao);
            } else {
                ans = String.format("%d + %di",thuc,ao);
            }
            return ans;
        }

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            SoPhuc a = new SoPhuc(cin.nextInt(), cin.nextInt());
            SoPhuc b = new SoPhuc(cin.nextInt(), cin.nextInt());
            SoPhuc c = (a.add(b)).mul(a);
            SoPhuc d = (a.add(b)).mul(a.add(b));
            System.out.println(c.toString() + ", " + d.toString());
        }
    }
}
