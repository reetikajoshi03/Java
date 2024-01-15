import java.util.*;
public class q2 
{
    public static boolean isEven(int n)
    {
        boolean isEven = true;
        if(n%2!=0)
        {
            isEven=false;
        }
        System.out.println(isEven);
        return isEven;
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = S.nextInt();
        boolean ans = isEven(n);
    }
    
}
