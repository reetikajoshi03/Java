import java.util.*; 
public class calculator 
{
    public static void main(String args[])
    {
        Scanner S = new Scanner(System.in);
        int a, b;
        System.out.print("Enter operands: ");
        a = S.nextInt();
        b = S.nextInt();
        System.out.println("Enter operator");
        char operator = S.next().charAt(0);

        switch(operator)
        {
            case '+':
            System.out.print(a+b);
            break;

            case '-':
            System.out.print(a-b);
            break;
            
            case '*':
            System.out.print(a*b);
            break;

            case '/':
            System.out.print(a/b);
            break;

            case '%':
            System.out.print(a%b);
            break;

            default:
            System.out.println("Sorry");
        }
    }
}
