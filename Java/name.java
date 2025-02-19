import java.util.*;

public class name {
    public static void main(String[] args){
        Scanner inpt = new Scanner(System.in);
        System.out.println("enter name: ");
        String name = inpt.next();
        System.out.println("enter age: ");
        int age = inpt.nextInt();
        System.out.println("Welcome" + name +"Your" + age + "Years old");
        inpt.close(); 
}