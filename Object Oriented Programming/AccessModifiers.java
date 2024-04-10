public class AccessModifiers 
{
    public static void main(String[] args) 
    {
        BankAccount B = new BankAccount();
        B.username = "ReetikaJoshi";
        B.setPassword("abcdef");
    }
}

class BankAccount
{
    public String username;
    private String password;
    public void setPassword(String pwd)
    {
        password = pwd;
    }
}
