import java.util.Scanner;

public class J04002_KhaiBaoLopHInhChuNhat {
    public static  class Rectange {
        private double width, height;
        private String color;

        public boolean isValid() {
            return !(width <= 0) && !(height <= 0);
        }

        public Rectange() {
            this.width = 1;
            this.height = 1;
        }

        public Rectange(double width, double height, String color) {
            this.width = width;
            this.height = height;
            this.color = color;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double w) {
            this.width = w;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double h) {
            this.width = h;
        }

        public String getColor() {
            String temp = color.toLowerCase();
            temp = temp.substring(0,1).toUpperCase() + temp.substring(1,temp.length());
            return temp;
        }

        public void setColor(String c) {
            this.color = c;
        }

        public double findArea() {
            return this.width * this.height;
        }

        public double findPerimeter() {
            return (this.height + this.width)*2;
        }
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Rectange a = new Rectange(cin.nextDouble(),cin.nextDouble(),cin.next());
        if (!a.isValid()) System.out.print("INVALID");
        else {
            System.out.printf("%.0f %.0f %s",a.findPerimeter(),a.findArea(),a.getColor());
        }
    }
}
