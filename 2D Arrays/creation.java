import java.util.*;
public class creation
{
    public static boolean search(int matrix[][], int key)
    {
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("found at (" + i + "," + j + ")");         
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        System.out.println("Enter elements: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j]=S.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            System.out.println();
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }

        search(matrix, 5);

    }
}