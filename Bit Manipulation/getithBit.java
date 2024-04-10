import java.util.*;
public class getithBit
{
    public static int getIthBit(int n, int i)
    {
        int bitMask = 1<<i;
        int result = n & bitMask;
        if(result==0)
        {
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        int n ,i;
        System.out.println("Enter number: ");
        n = S.nextInt();
        System.out.println("Enter bit: ");
        i = S.nextInt();
        getIthBit(n, i);
        System.out.println(getIthBit(n, i));
    }
}