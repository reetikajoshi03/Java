//Count how many times lower case vowels occurred ina String entered by the user.

import java.util.*;
public class q1 
{
    public static void count(String str)
    {
        int count=0;
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println(count + " times lower vowels occurred in " + str);
    }
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = S.nextLine();
        count(str);
    }
}
