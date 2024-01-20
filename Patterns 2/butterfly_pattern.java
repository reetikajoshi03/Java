import java.util.*;
public class butterfly_pattern 
{
    public static void butterfly(int n)
    {
        int i, j;
        for(i=1; i<=n; i++)
        {
            System.out.println(" ");
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
        }

        for(i=n; i>=1; i--)
        {
            System.out.println(" ");
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(j=1; j<=2*(n-i); j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++)
            {
                System.out.print("*");
            }
        }

    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = S.nextInt();
        butterfly(n);
    
    }
}
