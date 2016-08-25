package EighteenChapter;

public class ThreadTest extends Thread{
    public void run() {
        int count = 10;
        while(true) {
            System.out.println(count + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
            if(--count == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        new ThreadTest().start();
    }
}
