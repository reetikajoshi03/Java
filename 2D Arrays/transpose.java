//Write a program to Find Transpose of a Matrix.
public class transpose 
{
    public static int transpose(int matrix[][])
    {
        int n = matrix.length;
        int m = matrix[0].length;
        int transposedMatrix[][] = new int[m][n];
        for(int i=0; i<n; i++)
        {
            System.out.println(" ");
            for(int j=0; j<m; j++)
            {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        //print
        /*System.out.println("The transposed matrix is: ");
        for(int i=0; i<matrix.length; i++)
        {
            System.out.println(" ");
            for(int j=0; j<matrix[0].length; j++)
            {
                System.out.print(transposedMatrix[i][j]);
            }
        }*/

        return transposedMatrix;
    }
    public static void main(String[] args) 
    {
        int matrix[][] = {{1, 2, 3}, {4, 5, 6}};
        transpose(matrix);
    }
    
}
