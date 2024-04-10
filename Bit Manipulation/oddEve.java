import java.util.*;
public class oddEve 
{
    public static void oddOrEven(int n)
    {
        int result = n & 1;
        if(result==1)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Even");
        }
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = S.nextInt();
        oddOrEven(n);
    }
}
