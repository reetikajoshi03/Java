import java.util.*;

public class q3 {
    public static void main(String[] args) 
    {
        Scanner S = new Scanner(System.in);
        float pen, pencil, eraser, tot;
        System.err.println("Enter the cost of pen: ");
        pen = S.nextFloat();
        System.err.println("Enter the cost of pencil: ");
        pencil = S.nextFloat();
        System.err.println("Enter the cost of eraser: ");
        eraser = S.nextFloat();

        pen = pen+(18*pen)/100;
        pencil = pencil+(18*pencil)/100;
        eraser = eraser+(18*eraser)/100;

        tot = pen+pencil+eraser;
        System.out.println("Total = " + tot);



    }
    
}
