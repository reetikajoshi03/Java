import java.util.*;
public class strings
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        String str = "Reetika";
        String str2 = new String("Joshi");
        System.out.println(str);
        System.out.println(str2);
        
        //taking input
        //System.out.print("Enter sentence: ");
        //String str3 = S.nextLine();
        //System.out.println(str3);

        //string length
        System.out.println(str.length());

        //concatenation
        String fullName = str + " " + str2;
        System.out.println("Full name is: " + fullName);

    }
}