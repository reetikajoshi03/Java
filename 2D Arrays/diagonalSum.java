public class diagonalSum 
{
    public static int diagonalSum(int matrix[][]) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int sum = 0;
        /*for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j || i+j == n-1)
                {
                    sum=sum+matrix[i][j];
                }
            }
        }*/

        for(int i=0; i<n; i++)
        {
            sum+=matrix[i][i];
            if(i != n-1-i)
            {
                sum+=matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        //int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Sum of diagonals = " + diagonalSum(matrix));
    }
    
}
