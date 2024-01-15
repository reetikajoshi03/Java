import java.util.*;

public class q1 
{
    public static void main(String args[]) 
    {
        Scanner S = new Scanner(System.in);
        int a, b, c;
        float sum, avg;
        System.out.println("Enter 1st number: ");
        a = S.nextInt();
        System.out.println("Enter 2nd number: ");
        b = S.nextInt();
        System.out.println("Enter 3rd number: ");
        c = S.nextInt();

        sum = a+b+c;
        avg = sum/3;
        System.out.println("Avg = "+ avg);
        
    }
    
}
