class Student {
    private String name;   // private = hidden

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//Data direct access नाही, method द्वारे access करतो
// Benefit: Data is secure
// Control access using getters/setters
//>>>>>>>>>>>>>>>>>>>>>>>>>Main class<<<<<<<<<<<<<<<<<<<<<<<

public class MainEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        System.out.println(s.getName());
    }
}