import java.util.*;
public class BREAK 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n;
        while(true)
        {
            System.out.print("Enter the number: ");
            n = S.nextInt();
            if(n%10==0)
            {
            break;
            }
            System.out.print(n);
        }
        System.out.print("You have entered a multiple of 10");

        
    }
    
}
