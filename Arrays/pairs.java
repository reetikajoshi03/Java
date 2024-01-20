public class pairs 
{
    public static void pairs(int num[])
    {
        int i, j, curr;
        for(i=0; i<num.length; i++)
        {
            curr=num[i];
            for(j=i+1; j<num.length; j++)
            {
                System.out.print("(" + curr + "," + num[j] + ")");
            }
        }
    }
    public static void main(String[] args) 
    {
        int num[] = {2, 4, 6, 8, 10};
        pairs(num);
    }
    
}
