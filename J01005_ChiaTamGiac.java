import java.util.Scanner;

public class J01005_ChiaTamGiac {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();
        for (int p = 0 ; p < t ; p++)
        {
            int n = cin.nextInt();
            int h = cin.nextInt();

            for (int i = 1 ; i < n ; i++)
            {
                System.out.format("%.6f ", (double) h * Math.sqrt((double)i/n ));
            }
            System.out.println();
        }
    }
}
