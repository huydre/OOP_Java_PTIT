import java.util.Scanner;

public class J03038_DanhDauChuCai {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        System.out.println(s.chars().distinct().count());
    }
}
