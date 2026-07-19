abstract class Animal {

    public abstract void sound();

    public abstract void eat();

    public void sleep() {
        System.out.println("Non-Abstract Method: Sleeping");
    }

    public void walk() {
        System.out.println("Non-Abstract Method: Walking");
    }
}

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Abstract Method: Dog is Barking");
    }

    @Override
    public void eat() {
        System.out.println("Abstract Method: Dog is Eating");
    }

    public static void main(String[] args) {

        Animal obj1 = new Dog();

        System.out.println("Access Non-Abstract Methods Using Abstract Class Reference:");
        obj1.sleep();
        obj1.walk();

        Dog obj2 = new Dog();

        System.out.println("Call Abstract Methods Using Child Class Object:");
        obj2.sound();
        obj2.eat();

        System.out.println("Call Non-Abstract Methods Using Child Class Object:");
        obj2.sleep();
        obj2.walk();
    }
}
