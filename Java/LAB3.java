import java.util.Scanner;
class verification{
    static void positive_negative(int a)
    {
        if(a > 0)
        {System.out.println("This is a positive interger");}
        else
        {System.out.println("This is a negative integer");}
    }
    static void positive_negative_zero(int a)
    {
        if(a > 0)
        {System.out.println("This is a positive interger");}
        else if (a < 0)
        {System.out.println("This is a negative integer");}
        else
        {System.out.println("This is 0");}

    }
    static void sum_digits(int a) // this is third question
    {
        if(a > 0)
        {System.out.println("This is a positive interger");}
        else if (a < 0)
        {System.out.println("This is a negative integer");}
        else
        {System.out.println("This is 0");}

    }
    
    static void voting(int a)
    {
        if(a > 18)
        {System.out.println("You are eligible to vote");}
        else
        {System.out.println("You are not eligible to vote");}
    }
    static void largest_number(int a,int b,int c)
    {
        if((a > b) && (a > c))
        {System.out.println("a is the greatest int");}
        else if ((b > a) && (b > c))
        {System.out.println("b is the greatest int");}
        else
        {System.out.println("c is the greatest int");}

    }
    static void average_marks(int a)
    {
        if(a >= 80)
        {System.out.println("you got is A grade");}
        else if ((a < 80) && (a >= 60))
        {System.out.println("you got B grade");}
        else if ((a < 60) && (a >= 40))
        {System.out.println("you got C grade");}
        else
        {System.out.println("you got F grade");}

    }
    static void point_game(string a) //this is 7th question
    {
        if(a > 0)
        {System.out.println("This is a positive interger");}
        else
        {System.out.println("This is a negative integer");}
    }
}
public class LAB3 {
    public static void main(String[] args) { 
        Scanner inpt = new Scanner(System.in);
        System.out.println("Q1 Check whether the number is positive or negative");
        System.out.println("Enter your number: ");
        int b =inpt.nextInt();
        verification.positive_negative(b);

        System.out.println("Q2 Check whether the number is positive or negative or zero");
        System.out.println("Enter your number: ");
        int c =inpt.nextInt();
        verification.positive_negative_zero(c);

        System.out.println("Q4 Check whether a person is eligible for voting");
        System.out.println("Enter your number: ");
        int d =inpt.nextInt();
        verification.voting(d);
        
        System.out.println("Q5 Check which number from the three is the largest");
        System.out.println("Enter a: ");
        int x =inpt.nextInt();
        System.out.println("Enter b: ");
        int y =inpt.nextInt();
        System.out.println("Enter c: ");
        int z =inpt.nextInt();
        verification.largest_number(x,y,z);

        System.out.println("Q6 Check your grades");
        System.out.println("Enter your marks: ");
        int p =inpt.nextInt();
        verification.average_marks(p);

        
        
        inpt.close();


        
    }
    


    
    
}
