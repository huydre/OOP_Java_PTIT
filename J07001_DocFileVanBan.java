import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07001_DocFileVanBan {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("DATA.in"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
}
