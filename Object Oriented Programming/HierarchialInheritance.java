public class HierarchialInheritance {
    
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
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animals{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animals{
    void fly(){
        System.out.println("Flies");
    }
}

