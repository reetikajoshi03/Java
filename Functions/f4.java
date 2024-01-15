import java.util.*;
public class f4 
{
    public static void prime(int n)
    {
        int i, p=0;
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                p++;
            }
        }
        if(p==2)
        {
            System.out.print("Prime");
        }
        else if(p==1)
        {
            System.out.print("Neither");
        }
        else
        {
            System.out.println("Not prime");
        }
        }

    
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter no.: ");
        n = S.nextInt();
        prime(n);
        
    }
}
