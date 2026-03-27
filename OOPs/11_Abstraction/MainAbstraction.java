//Abstract class → incomplete
// Child class → implementation

abstract class Vehicle {
    abstract void start();
}
// फक्त important गोष्ट दाखवतो, बाकी लपवतो
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with kick");
    }
}


//>>>>>>>>main class<<<<<<<<<<<
public class MainAbstraction {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}