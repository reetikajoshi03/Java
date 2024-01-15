import java.util.*;
public class print 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n, counter;
        System.out.print("Enter the value of n: ");
        n = S.nextInt();
        counter=1;
        while(counter<=n)
        {
            System.out.println(counter);
            counter++;
            
        }
    }

    
}
