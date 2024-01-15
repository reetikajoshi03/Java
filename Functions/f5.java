import java.util.*;
public class f5 
{
    public static void primesinrange(int n1, int n2)
    {
        int n, i, j, p; 
        for(i=n1; i<=n2; i++)
        {
            p=0;
            for(j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    p++;
                }
                
            
            }
            if(p==2)
            {
                System.out.println(i);
            }
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter range: ");
        n1 = S.nextInt();
        n2 = S.nextInt();
        System.out.println("Primes in range are: ");
        primesinrange(n1, n2);

    }
}
