import java.util.*;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int getArea() {
        int Area = length * breadth;
        return Area;
    }
}
public class class_rectangle {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        System.out.print("Enter your length: ");
        int length = inpt.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = inpt.nextInt();
        inpt.close();

        Rectangle R1 = new Rectangle(length, breadth);
        System.out.println("The area of the rectangle is " + R1.getArea());

    }
}
