public class function_array 
{
    public static void update(int numbers[])
    {
        int i;
        for(i=0; i<numbers.length; i++)
        {
            numbers[i]=numbers[i]+10;
        }
    }
    public static void main(String[] args) 
    {
        int i;
        int numbers[] = {1, 2, 3};
        update(numbers);

        for(i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }


    }
    
}
