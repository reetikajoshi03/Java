import java.util.*;
public class f1
{
    public static int product(int a, int b)
    {
        int prod=a*b;
        //System.out.println("Product is: "+ prod);
        return prod;
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        int a, b;
        System.out.print("Enter 2 nos.: ");
        a = S.nextInt();
        b = S.nextInt();
        //product(a,b);
        int prod = product(a, b);
        System.out.println("Product is: " + prod);

        
    }
}