package thread;

public class InterruptDemo {
    public static void main(String[] args) {
        MyNewThread myThread = new MyNewThread();
        myThread.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread.interrupt();
    }
}

class MyNewThread extends Thread {
    @Override
    public void run() {
        while (!isInterrupted()) {
            System.out.println("Работаю...");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван.");
                break;
            }
            if (isInterrupted()) {
                System.out.println("Поток был прерван (проверка флага).");
                break;
            }
        }
    }
}




