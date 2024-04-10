public class spiralMatrix 
{
    public static void printSpiral(int matrix[][])
    {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startColumn = 0;
        int endColumn = matrix[0].length-1;
        while(startRow<=endRow && startColumn<=endColumn)
        {
            for(int j=startColumn; j<=endColumn; j++)
            {
                System.out.print(matrix[startRow][j] + " ");
            }

            for(int i=startRow+1; i<=endRow; i++)
            {
                System.out.print(matrix[i][endColumn] + " ");
            }

            for(int j=endColumn-1; j>=startColumn; j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            for(int i=endRow-1; i>=startRow+1; i--)
            {
                if(startColumn==endColumn)
                {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startRow++;
            startColumn++;
            endRow--;
            endColumn--;
            
        }
    }
    public static void main(String[] args) 
    {
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11 ,12}, {13, 14, 15, 16}};
        printSpiral(matrix);
    }
}
