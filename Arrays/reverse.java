public class reverse 
{
    public static void reverseArray(int num[])
    {
        int first=0, last=num.length-1, temp;
        while(first<last)
        {
            temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) 
    {
        int i, num[] = {2, 4, 6, 8, 10};
        reverseArray(num);
        for(i=0; i<num.length; i++)
        {
            System.out.print(num[i] + " ");
        }
        
    }
    
}
