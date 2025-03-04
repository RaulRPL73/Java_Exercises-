public class PrimeNumbers 
{
    public static void main(String[] args)
    {
        for(int numero = 0; numero <= 100; numero++)
        {
            if(primo(numero))
            {
                System.out.println(numero + " es primo");
            }
            else
            {
                System.out.println(numero + " no es primo");
            }
        }
    }

    public static boolean primo(int n)
    {
        if(n < 2)
        {
            return false; // 0 and 1 are not prime numbers
        }

        for(int i = 2; i <= Math.sqrt(n); i++) // Only check up to the square root of n
        {
            if(n % i == 0)
            {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true; // Prime number
    } 
}
