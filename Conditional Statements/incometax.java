import java.util.*;

public class incometax 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        float in, tax;
        System.out.print("Enter income in lakhs: ");
        in = S.nextFloat();

        if(in<500000)
        {
            tax=0;
        }

        else if(in>=500000 && in<=1000000)
        {
            tax=(20*in)/100;
        }

        else
        {
            tax=(30*in)/100;
        }

        System.out.print("Tax is "+ tax);
    }
    
}
