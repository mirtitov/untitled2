package thread;

public class ThreadExtendDemo {
    public static void main(String[] args) throws InterruptedException {


        MyThread thread1 = new MyThread("Поток 1");
        MyThread thread2 = new MyThread("Поток 2");
        MyThread thread3 = new MyThread("Поток 3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("Все потоки завершили работу");


    }
}
