package thread;

public class Consumer extends Thread{
    private final Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }


    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.remove();

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

