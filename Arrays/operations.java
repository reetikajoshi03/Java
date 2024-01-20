import java.util.*;
public class operations 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int marks[] = new int[100];
        //input
        System.out.print("Enter marks of phy, chem, maths: ");
        marks[0] = S.nextInt();
        marks[1] = S.nextInt();
        marks[2] = S.nextInt();

        //output
        System.out.println("phy: "+ marks[0]);
        System.out.println("chem: "+ marks[1]);
        System.out.println("maths: "+ marks[2]);

        //updation
        marks[1] = marks[1] + 6;
        System.out.println("updated chem: "+ marks[1]);

        //percentage
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.print("Percent: " + percentage + "%");

        //length
        System.out.print("Length of array: "+ marks.length);
    }
}
