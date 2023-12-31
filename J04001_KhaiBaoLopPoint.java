import java.util.Scanner;

class Point {
    double x,y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public  double getY() {
        return y;
    }

    public double distance(Point secondPoint){
        return Math.sqrt(Math.pow(this.x - secondPoint.getX(),2) + Math.pow(this.y - secondPoint.getY(),2));
    }

    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(),2) + Math.pow(p1.getY() - p2.getY(),2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class J04001_KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int t = Integer.parseInt(cin.nextLine());
        while (t --> 0) {
            Point p1 = new Point(cin.nextDouble(), cin.nextDouble());
            Point p2 = new Point(cin.nextDouble(), cin.nextDouble());
            System.out.printf("%.4f\n",p1.distance(p2));
        }
    }
}
