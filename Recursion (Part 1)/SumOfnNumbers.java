public class SumOfnNumbers 
{
    public static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        int sumOfNumbers = n + sum(n-1);
        return sumOfNumbers;
    }
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.print(sum(n));
    }
}
