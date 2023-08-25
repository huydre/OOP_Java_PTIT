import java.util.Scanner;

public class J02011_SapXepChon {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n+5];

        for (int i = 0 ; i < n ; i++) a[i] = cin.nextInt();;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
            //print
            System.out.print("Buoc " + (int)(i+1) + ": ");
            for (int j =  0 ; j < n ; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}
