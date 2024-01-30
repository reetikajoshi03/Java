import java.io.*;
import java.util.*;

public class intro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum_length=A.length() + B.length();
        System.out.println(sum_length);
        
        if(A.compareTo(B)<0)
        {
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
        System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1,A.length()) + " " + B.substring(0,1).toUpperCase() + B.substring(1, B.length()));
        
        
        
    }
}




