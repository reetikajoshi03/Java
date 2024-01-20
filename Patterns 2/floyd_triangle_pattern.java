import java.util.*;
public class floyd_triangle_pattern 
{
    public static void floyd_triangle_pattern(int n)
    {
        int i, j, k=1;; 
        for(i=1; i<=5; i++)
        {
            System.out.println(" ");
            {
                for(j=1; j<=i; j++)
                {
                    System.out.print(k+ " ");
                    k++;
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
        floyd_triangle_pattern(n);

    }
    
}
