public class GettersSetters 
{
    public static void main(String[] args) 
    {
        Pen P = new Pen();

        P.setColor("Blue");
        System.out.println(P.getColor());
        P.setTip(10);
        System.out.println(P.getTip());
        P.setColor("Lavender");
        System.out.println(P.getColor());
    }
}

class Pen
{
    private String color;
    private int tip;

    String getColor()
    {
        return this.color;
    }

    int getTip()
    {
        return this.tip;
    }

    void setColor(String color)
    {
        this.color = color;
    }

    void setTip(int tip)
    {
        this.tip = tip;
    }
}
