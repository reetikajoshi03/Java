public class reverse1 
{
    public static void main(String args[])
    {
        int n =25103;
        int l, rev=0;
        while(n>0)
        {
            l=n%10;
            rev = (rev*10)+l;
            n=n/10;
        }
        System.out.print(rev);
    }
    
}
