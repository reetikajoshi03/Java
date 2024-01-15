import java.util.*;
public class prime 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int i, p=0;
        long n;
        System.out.println("Enter number: ");
        n = S.nextLong();
        for(i=1; i<=n; i++)
        {
            if(n%i==0)
            {
                p++;
            }
        }

        if(p==2)
        {
            System.out.println("Prime");
        }
        else if (p==1) {
            System.out.println("neither");
            
        }
        else{
            System.out.println("Not prime");
        }

    }
    
}
