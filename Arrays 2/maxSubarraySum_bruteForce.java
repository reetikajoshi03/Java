public class maxSubarraySum_bruteForce
{
    public static void maxSubarraySum(int num[])
    {
        int i, j, k;
        int currSum, maxSum=num[0];
        for(i = 0; i<num.length; i++)
        {
            System.out.println(" ");
            for(j=i; j<num.length; j++)
            {
                System.out.println(" ");
                currSum = 0;
                for(k=i; k<=j; k++)
                {
                    currSum = currSum + num[k];
                }
                System.out.println(currSum);
                if(currSum>maxSum)
                {
                    maxSum=currSum; 
                }
            }
        }
        System.out.println("Maximum sum = " + maxSum);
    }
    public static void main(String args[])
    {
        int num[] = {1, -2, 6, -1, 3};
        maxSubarraySum(num);
    }
}