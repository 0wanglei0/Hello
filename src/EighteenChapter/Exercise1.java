package EighteenChapter;

public class Exercise1 extends Thread {
    public static void main(String[] args) {
        Exercise1 e = new Exercise1();
        e.run();
    }

    int a = 0;
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("aaaa" + ++a);
        }
    }
}
