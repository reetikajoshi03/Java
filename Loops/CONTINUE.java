import java.util.*;
public class CONTINUE 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n;
        
        while(true)
        {
            System.out.println("Enter numbers: ");
            n = S.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }
        
        
    }
    
}
