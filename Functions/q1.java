import java.util.*; 
public class q1 
{
    public static void average(int a, int b, int c)
    {
        double avg = (a+b+c)/3.0;
        System.out.print("Average is: "+ avg);
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter three numbers:  ");
        int a = S.nextInt();
        int b = S.nextInt();
        int c = S.nextInt();
        average(a, b, c);
    }
    
}
