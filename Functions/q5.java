import java.util.*;
public class q5 
{
    public static int sumofdigits(int n)
    {
        int sum=0, ld;
        while(n>0)
        {
            ld = n%10;
            n=n/10;
            sum=sum+ld;
        }
        System.out.println("Sum of digits = "+sum);
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = S.nextInt();
        int sumofdigits = sumofdigits(n);
        System.out.println(sumofdigits);
    }
}
