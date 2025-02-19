import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        Scanner cat = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = cat.nextInt();

        if(a % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
        cat.close();
        }
    }

    

