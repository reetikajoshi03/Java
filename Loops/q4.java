import java.util.*; 
public class q4 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int n, a=1;
        System.out.println("Enter no: ");
        n = S.nextInt();
        System.out.println("Table");
        while(a<=10)
        {
            System.out.println(n +"*" +a +"="+a*n);
            a++;
        }
    }
}
