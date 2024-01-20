//linear search for string array
public class linearSearch 
{
    public static void linear_search(String menu[], String key)
    {
        int i, j=0;
        for(i=0; i<menu.length; i++)
        {
            if(menu[i]==key)
            {
                j=1;
                break;
            }
        }
        if(j==1)
        {
            System.out.print(key + " found at index " + i);
        }
        else
        {
            System.out.print(key + " not found");
        }
        
    }

    public static void main(String[] args) 
    {
        String menu[] = {"dosa", "samosa", "paratha", "momos", "maggie"};
        String key = "samosa";
        linear_search(menu, key);
        
    }
}
