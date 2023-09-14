import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J07022_LoaiBoSoNguyen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner cin = new Scanner(new File("DATA.in"));
        List<String> list = new ArrayList<>();
        while (cin.hasNext()) {
            if (!cin.hasNextInt()) {
                list.add(cin.next());
            }
            else {
                cin.next();
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        for (String s: list) {
            System.out.print(s + " ");
        }
    }
}
