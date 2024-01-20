import java.util.*;
public class hollow_rhombus 
{
    public static void hollow_rhombus_pattern(int n)
    {
        int i, j;
        for(i=1; i<=5; i++)
        {
            System.out.println(" ");
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=5; j++)
            {
                if(i>=2 && i<5)
                {
                    if(i+j==7 || i+j==8 || i+j==9)
                    {
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else
                {
                    System.out.print("*");
                }
                
            }
        }
    } 
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = S.nextInt();
        hollow_rhombus_pattern(n);
    }
}
