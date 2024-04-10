public class RemoveDuplicates 
{
    public static void removeDuplicates(String str, int i, StringBuilder newStr, boolean map[])
{
    if(i == str.length())
    {
        System.out.print(newStr);
        return;
    }

    char currChar = str.charAt(i);
    if(map[currChar-'a'] == true)
    {
        removeDuplicates(str, i+1, newStr, map);
    }
    else
    {
        map[currChar-'a'] = true;
        removeDuplicates(str, i+1, newStr.append(currChar), map);
    }
}
    public static void main(String args[])
    {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
