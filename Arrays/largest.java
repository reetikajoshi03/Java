public class largest 
{
    public static void largestNumber(int num[])
    {
        int i, l = num[0], j=0;
        for(i=0; i<num.length; i++)
        {
            
            if(num[i]>l)
            {
                l=num[i];
                j=i;
            }
        }
        System.out.print("The largest number in the array is " + l + " and is present at index " + j);
    }
    public static void main(String[] args) 
    {
        int num[] = {1, 2, 5, 8, 3, 9, 7};
        largestNumber(num);
    }
    
}
