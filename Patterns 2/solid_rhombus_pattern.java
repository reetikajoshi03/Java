import java.util.*; 
public class solid_rhombus_pattern 
{
    public static void solid_rhombus(int n)
    {
        int i, j;
        for(i=1; i<=n; i++)
        {
            System.out.println(" ");
            for(j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(j=1; j<=5; j++)
            {
                System.out.print("*");
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = S.nextInt();
        solid_rhombus(n);
        
    }
}
