import java.util.*;

public class ternary 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int a, b;
        System.out.print("Enter two nos.: ");
        a = S.nextInt();
        b = S.nextInt();
        int ans = (a>b?a:b);
        System.out.print("Greater is "+ans);
    }
}
