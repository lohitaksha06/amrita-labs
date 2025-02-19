public class datatypes 
// string is a non primitive type, hence we need to use "" symbol 
{
    public static void main(String[] args)
    {
        long range = -423322009; //9 is the max limit for a long range
        // for short we use 'short' 'name' = small byte
        // the byte ranges from -128 1o +127,  u cannot get at 128.
        System.out.println(range);
        double number = -42.3;
        System.out.println(number);
        short cake = 1; //limit for short is 4 byte, minimum value is -32678 and max value is 32677
        System.out.println(cake);
        char letter1 = '9'; //if its one digit we give single quote
        // prints 9
        System.out.println(letter1);
        char letter2 = 65; // if its more than one digit we dont need to give quotes, it automatically converts to ascii value
        // prints A
        System.out.println(letter2);
        
// \n is used for newline \t is for tab

    }
}
