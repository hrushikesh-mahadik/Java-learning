public class Car {

    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
      

    String getBrand() {
        return this.brand;
    }

    String getModel() {
        return this.model;
    }

    int getPrice() {
        return this.price;
    }


    void setModel(String model) {
        this.model = model;
    }

}