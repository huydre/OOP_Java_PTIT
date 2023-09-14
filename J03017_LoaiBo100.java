import java.util.ArrayList;
import java.util.Scanner;

public class J03017_LoaiBo100 {
    public static class Pair {
        public char first;
        public int second;
        Pair(char first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public static int remove100(String str) {
        ArrayList<Pair> arr = new ArrayList<>();
        arr.add(new Pair('@',-1));
        int maxlen = 0;
        for (int i = 0 ; i < str.length(); i++) {
            arr.add(new Pair(str.charAt(i),i));
            while (arr.size() >= 3 &&
                    arr.get(arr.size()-3).first=='1' &&
                    arr.get(arr.size()-2).first=='0' &&
                    arr.get(arr.size()-1).first=='0')
            {
                arr.remove(arr.size() - 3);
                arr.remove(arr.size() - 2);
                arr.remove(arr.size() - 1);
            }
            int tmp = arr.get(arr.size() - 1).second;
            maxlen = Math.max(maxlen, i - tmp);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            String n = cin.nextLine();
            System.out.println(remove100(n));
        }
    }
}
