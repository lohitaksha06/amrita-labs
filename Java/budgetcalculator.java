import java.util.*;

public class budgetcalculator{

    public static double adding_2_numbers(double a, double b)
    {
        return (a + b); //double will give many decimal parts (like float);
    }
    public static double adding_3_numbers(double a, double b, double c)
    {
        return (a + b + c); //double will give many decimal parts (like float);
    }
    public static double square(double a)
    {
        return (a*a); //double will give many decimal parts (like float);
    }
    public static double rectangle(double a,double b)
    {
        return (a*b); //double will give many decimal parts (like float);
    }
    public static double circle(double r)
    {
        return (3.14*r*r); //double will give many decimal parts (like float);
    }
    public static double discriminant(double a, double b, double c)
    {
        return ((b*b)-(4*a*c)); //double will give many decimal parts (like float);
    }
    public static double sqrt(double a, double b)
    {
        return ((a+b)/2); //double will give many decimal parts (like float);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your number: ");
        double first_number = input.nextInt();
        System.out.print("enter your second number: ");
        double second_number = input.nextInt();
        double sum = adding_2_numbers(first_number, second_number);
        System.out.println(sum);

        System.out.print("Enter your number: ");
        double a = input.nextInt();
        System.out.print("enter your second number: ");
        double b = input.nextInt();
        System.out.print("Enter your third number: ");
        double c = input.nextInt();
        double add = adding_3_numbers(a, b, c);
        System.out.println(add);

        System.out.print("Enter your number: ");
        double d = input.nextInt();
        double square_area = square(d);
        System.out.println(square_area);

        System.out.print("Enter your number: ");
        double p = input.nextInt();
        System.out.print("enter your second number: ");
        double q = input.nextInt();
        double rec = rectangle(p, q);
        System.out.println(rec);

        System.out.print("Enter your number: ");
        double r = input.nextInt();
        double circ = circle(r);
        System.out.println(circ);
        
        System.out.print("Enter your number: ");
        double aa = input.nextInt();
        System.out.print("enter your second number: ");
        double bb = input.nextInt();
        System.out.print("Enter your third number: ");
        double cc = input.nextInt();
        double disc = discriminant(aa, bb, cc);
        System.out.println(disc);
        

        input.close();

    }

}
