class Animal {
    //एक class दुसऱ्याचे गुण वापरतो याला Inheritance म्हणतात

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {  //extends → child class uses parent properties
    void bark() {
        System.out.println("Barking...");
    }
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>MAIN CLASS<<<<<<<<<<<<<<<<<<<<<<<<<<
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited method
        d.bark();
    }
}