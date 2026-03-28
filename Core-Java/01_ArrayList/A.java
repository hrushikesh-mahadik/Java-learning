import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class A{
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("rushi");
        names.add("kartik");
        names.add("vishwa");
        names.add("Saurav");
        names.add("bhavesh");
        names.add("dev");
        names.add("abhi");
        System.out.println(names);

        names.remove("dev");
        System.out.println(names);

        names.set(4, "Bhavesh2");
        System.out.println(names);

        System.out.println(names.get(3));

        System.out.println(names.size());

        Collections.sort(names);
        System.out.println(names);
    }
}