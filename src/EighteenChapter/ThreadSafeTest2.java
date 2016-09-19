package EighteenChapter;

public class ThreadSafeTest2 implements Runnable {
    public static void main(String[] args) {
        ThreadSafeTest2 t = new ThreadSafeTest2();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }

    int num = 10;
    public void run() {
        while(true) {
            doit();
        }
    }

    public synchronized void doit() {
        if (num > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tickets" + --num);
        }
    }
}
