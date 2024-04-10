public class MultipleInheritance 
{
    public static void main(String[] args) 
    {
        Bear b = new Bear();
        b.eats();
        b.eatingHabits();
    }
}

interface Herbivore
{
    void eats();
}

interface Carnivore
{
    void eatingHabits();
}

class Bear implements Herbivore, Carnivore
{
    public void eats()
    {
        System.out.println("Veg");
    }

    public void eatingHabits()
    {
        System.out.println("Non-veg");
    }
}