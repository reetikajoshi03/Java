public class Power 
{
    public static int printPower(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }

        return x*printPower(x, n-1);
    }
    public static void main(String[] args) 
    {
        System.out.print(printPower(2, 10));
    }
}
