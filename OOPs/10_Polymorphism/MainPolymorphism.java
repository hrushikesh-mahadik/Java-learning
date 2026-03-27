//Compile-time (Method Overloading)
//Runtime (Method Overriding)
//Same method name → different parameters
class Addition {
    int add(int a, int b) {
        return a + b;
    }
//एकच method वेगवेगळे काम करतो
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
//>>>>>>>>>>>>>>Main Class<<<<<<<<<<<<<<<<<<<<<
public class MainPolymorphism {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
    }
}
