import java.util.*;
public class Question1
{
    public static void main(String args[])
    {
        Complex c = new Complex();
        c.sum(0, 0, 0, 0);
    }
}

class Complex
{
    Scanner S = new Scanner(System.in);
    int real1 = S.nextInt();
    int imag1 = S.nextInt();
    int real2 = S.nextInt();
    int imag2 = S.nextInt();

    void sum(int real1 , int imag1 , int real2 , int imag2)
    { 
        int real = real1 + real2;
        int imag = imag1 + imag2;
        System.out.println(real + " + " + imag + " i ");
    }

}