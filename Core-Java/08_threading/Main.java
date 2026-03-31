
/*Important Concept

👉 आता 2 threads चालू आहेत:

Main Thread
Child Thread

👉 दोघे एकाच वेळी चालतात (parallel execution)

🔹 Output का random येतो?

👉 कारण CPU कधी main thread चालवेल आणि कधी child thread
👉 त्यामुळे output order fix नसतो*/
class MyThread extends Thread {

    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
            
            try {
                Thread.sleep(500); // थोडा delay
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();  // Thread start

        for(int i = 1; i <= 6; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}