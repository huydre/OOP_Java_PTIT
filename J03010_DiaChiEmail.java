import java.util.Scanner;

public class J03010_DiaChiEmail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String email[] = new String[105];
        for (int i = 0 ; i < t; i++)
        {
            String s = in.nextLine();
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            s = s.toLowerCase();
            String tmp[] = s.split(" ");
            int n = tmp.length - 1;
            email[i] = "";
            email[i] += tmp[n];
            for (int j = 0 ; j < n ; j++)
            {
                email[i] += String.valueOf(tmp[j].charAt(0));
            }
        }
        for (int i = 0 ; i < t; i++)
        {
            int d = 1;
            for (int j = i - 1; j >= 0 ; j--)
            {
                if (email[i].equals(email[j]))
                    d++;
            }
            if (d == 1)
                System.out.println(email[i] + "@ptit.edu.vn");
            else
                System.out.println(email[i] + d + "@ptit.edu.vn");

        }
    }
}

