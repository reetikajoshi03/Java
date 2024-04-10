public class setIthBit 
{
    public static int setIthBit(int n, int i)
    {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) 
    {
        int n, i;
        System.out.println(setIthBit(10, 2));

    }
}
