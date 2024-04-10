public class MultiLevelInheritance {
    public static void main(String args[]){
        Dog tommy = new Dog();
        tommy.eat();
        tommy.legs = 4;
        System.out.println(tommy.legs);
    }
}

class Animals{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animals{
    int legs;
}

class Dog extends Mammal{
    String breed;
}