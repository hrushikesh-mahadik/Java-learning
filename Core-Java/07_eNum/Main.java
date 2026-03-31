enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class Main {
    public static void main(String[] args) {
        //Java मध्ये enum म्हणजे fixed constants चा group.
        //Enum म्हणजे predefined constant values चा एक प्रकार.
        // enum variable declare
        Day today = Day.THURSDAY;

        // print value
        System.out.println("Today is: " + today);

        // using switch with enum
        switch(today) {
            case MONDAY:
                System.out.println("Start of week");
                break;

            case FRIDAY:
                System.out.println("Weekend coming");
                break;

            case SUNDAY:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Normal day");
        }
    }
}
