import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arryalist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("enter no od names");
    int nooffood = sc.nextInt();
    sc.nextLine();


        for(int i=0;i<=nooffood-1;i++){

            System.out.print("enter names" +i);
            String name = sc.nextLine();
            sc.nextLine();
                names.add(name);
        }
        Collections.sort(names);
        System.out.println(names);
    }
}
