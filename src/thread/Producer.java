package thread;

public class Producer extends Thread {
    private final Buffer buffer;

    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.add(i);

            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}


