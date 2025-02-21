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
public class array_rectangle {
    public static void main(String[] args) {
        
        Scanner inpt = new Scanner(System.in);
        Rectangle[] rectangles = new Rectangle[3];
        
        for(int i = 0; i < 3; i++){
            System.out.print("enter length for rectangle " + (i + 1) + ": ");
            int length = inpt.nextInt();
            System.out.print("enter breadth for rectangle " + (i + 1) + ": ");
            int breadth = inpt.nextInt();
            rectangles[i] = new Rectangle(length, breadth);
        }

        inpt.close();
        for (int i = 0; i < 3; i++) {
            System.out.println("Area of rectangle " + (i + 1) + " is: " + rectangles[i].getArea());
        }
        




    }
}
