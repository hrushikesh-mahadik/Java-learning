
public class Car {

    String name;
    Engine engine;
    int year;

    Car(String name, int year, String engineType) {
        this.name = name;
        this.year = year;
        this.engine = new Engine(engineType);
    
    }
 void display()
 {
     System.out.println("Name: "+name);
     System.out.println("Year: "+year);
     System.out.println("Engine Type: "+engine);
 }
    
}
