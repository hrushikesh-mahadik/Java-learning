import java.util.Scanner;

public class wmain {

    //runtime polymorphism or dynamic Polymorphism
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the choice: 1 for Car, 2 for Bike:");
         int choice = sc.nextInt();
         Vehicle vehicle;
         if (choice == 1) {
             vehicle = new Car();
             vehicle.go();
         } else if(choice == 2) {
             vehicle = new Bike();
             vehicle.go();
         }
        
    }
}
