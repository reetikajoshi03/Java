import java.util.*;
public class p3 
{
    public static void main(String args[])
{
    Scanner S = new Scanner(System.in);
    System.out.print("Enter no: ");
    int day = S.nextInt();
    switch(day)
    {
        case 1:
        System.out.print("Monday");
        break;
        case 2:
        System.out.print("tue");
        break;
        case 3:
        System.out.print("wed");
        break;
        case 4:
        System.out.print("thru");
        break;
        case 5:
        System.out.print("fri");
        break;
        case 6:
        System.out.print("sat");
        break;
        case 7:
        System.out.print("sun");
        break;
        default:
        System.out.println("sorry");
    }

}   
}
