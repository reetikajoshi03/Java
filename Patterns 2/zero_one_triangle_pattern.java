import java.util.*;
public class zero_one_triangle_pattern
{
    public static void zero_one_triangle_pattern(int n)
    {
        int i, j;
        for(i=1; i<=5; i++)
        {
            System.out.println(" ");
            for(j=1; j<=i; j++)
            {
                if(i%2!=0)
                {
                    if(j%2!=0)
                    {
                        System.out.print("1");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
                else{
                    if(j%2!=0)
                    {
                        System.out.print("0");
                    }
                    else
                    {
                        System.out.print("1");
                    }
                }
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.println("Enter n: ");
        n = S.nextInt();
        zero_one_triangle_pattern(n);     
    }
    
}
