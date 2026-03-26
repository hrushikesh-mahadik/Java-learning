public class Main {

    public static void main(String[] args) {
Car car = new Car("Porsche", "911", 300000);
       car.setModel("Cayenne");
 System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getPrice());
    }
}