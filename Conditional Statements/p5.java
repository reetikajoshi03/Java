import java.util.*;
public class p5 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter year: ");
        int yr = S.nextInt();

        if(yr%4==0)
        {
            if(yr%100==0)
            {
                if(yr%400==0)
                {
                    System.out.println("Leap yr");
                }
                else{
                    System.out.println("not a leap yr");
                }
            }
            else{
                System.out.println("Leap yr");
            }
        }

        else
        {
            System.out.println("not a leap yr");
        }
    }
    
}
