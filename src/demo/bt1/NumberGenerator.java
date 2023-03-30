package demo.bt1;

public class NumberGenerator implements Runnable {
    private Thread t;
    private final String threadName;

    public NumberGenerator(String threadName) {
        this.threadName = threadName;
        System.out.println("Thằng này tên là: " + threadName);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.print("Bắt đầu chạy" + threadName + ": " + i + "\n");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Lỗi: " + threadName);
        }
        System.out.println(threadName + " đã xong!");
    }

    public void start() {
        System.out.println("Bắt đầu " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
