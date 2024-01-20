import java.util.*;
public class inverted_half_pyramid 
{
    public static void inverted_half_pyramid(int n)
    {
        int i, j;
        for(i=1; i<=n; i++)
        {
            System.out.println(" ");
            for(j=1; j<=n-i+1; j++)
            {
                System.out.print(j);
            }
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = S.nextInt();
        inverted_half_pyramid(n);
    }
    
}
