import java.util.Scanner;

public class J01003_GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        float a = cin.nextFloat();
        float b = cin.nextFloat();

        if (a == 0 && b == 0) System.out.println("VSN");
        else if (a == 0 && b !=  0) System.out.println("VN");
        else System.out.format("%.2f",-b/a);
    }
}
