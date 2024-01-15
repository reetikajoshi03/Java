import java.util.*;
public class q2 
{
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        int i, n, sume=0, sumo=0, ch;
        do{
            System.out.print("Enter: ");
            n=S.nextInt();

            if(n%2==0)
            {
                sume=sume+n;
            }
            else{
                sumo=sumo+n;
            }

            System.out.print("Enter more?1 for yes 0 for no" );
            ch=S.nextInt();
        }while(ch==1);

        System.out.println("Even sum = "+sume);
        System.out.println("Odd sum = "+ sumo);
        
    }
    
}
