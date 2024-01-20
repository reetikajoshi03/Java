import java.util.*;
public class diamond_pattern 
{
    public static void diamond(int n)
    {
        int i, j;
        for(i=1; i<=n; i++)
        {
            System.out.println(" ");
            for(j=0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=(2*i-1); j++)
            {
                System.out.print("*");
            }
        }
        for(i=n; i>=1; i--)
        {
            System.out.println(" ");
            for(j=0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=(2*i-1); j++)
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
        diamond(n);
    }
}
