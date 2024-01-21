public class subarrays 
{
    public static void subarrays(int num[])
    {
        int i, j, k;
        for(i = 0; i<num.length; i++)
        {
            System.out.println(" ");
            for(j=i; j<num.length; j++)
            {
                System.out.println(" ");
                for(k=i; k<=j; k++)
                {
                    System.out.print(num[k]+" ");
                }
            }
        }
    }
    public static void main(String args[]) 
    {
        int num[] = {2, 4, 6, 8, 10};
        subarrays(num);
    }
    
}
