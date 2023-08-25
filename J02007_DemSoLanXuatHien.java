import java.util.Scanner;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = cin.nextInt();
        for(int j=1;j<t+1;j++) {
            System.out.println("Test "+j+":");
            int[] a = new int[100];
            int[] b = new int[100001],c=new int[100001];
            int n=cin.nextInt();
            for(int i=0;i<n;i++){
                a[i]=cin.nextInt();
                b[a[i]]++;
            }
            for(int i=0;i<n;i++){
                if(c[a[i]]==0){
                    System.out.println(a[i]+" xuat hien "+b[a[i]]+" lan");
                    c[a[i]]++;
                }
            }
        }
    }
}
