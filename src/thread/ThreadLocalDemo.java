package thread;

public class ThreadLocalDemo {

    // Создаем ThreadLocal для хранения счетчика, инициализируем значением 0
    private static final ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) throws InterruptedException {
        // Создаем несколько потоков
        int numThreads = 5;  // Например, 5 потоков
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    // Каждый поток увеличивает свой счетчик 100 раз
                    for (int j = 0; j < 100; j++) {
                        counter.set(counter.get() + 1);
                    }
                    // Выводим значение счетчика после выполнения
                    System.out.println(Thread.currentThread().getName() + " счетчик: " + counter.get());
                }
            });
            threads[i].start();
            threads[i].join();
        }



    }
}
