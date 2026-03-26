public class Main {
    public static void main(String[] args) {
        
        Car car = new Car();
        Bike bike = new Bike();
       
        Vehicle[] vehicles = {car, bike};
        for (Vehicle v : vehicles) {
            v.go();
        }
    }
}