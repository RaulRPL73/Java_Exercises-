
public class Fizz 
{
    public static void main(String[] args) 
    {
        //Scanner that makes you write the number 
        /*Scanner sc = new Scanner(System.in);*/
        int number;

        //Recieves the number
        for(number=1;number<=100;number++)
        {
            //Checks if it meets the conditions
            if(number%3==0 && number%5==0)
            {
                System.out.println("FizzBuzz: "+number);
            }

            else if(number%3==0)
            {
                System.out.println("Fizz: "+number);
            }

            else if(number%5==0)
            {
                System.out.println("Buzz: "+number);
            }
        }
    }
    
}
