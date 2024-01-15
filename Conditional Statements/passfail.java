import java.util.*;
public class passfail 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int marks;
        String result;
        System.out.print("Enter marks: ");
        marks = S.nextInt();
        result = (marks>=33?"pass":"fail");
        System.out.print(result);

    }
}
