package thread;

public class CounterDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        int countThreads = 3;
        int incrementThreads = 5000;

        Thread [] threads = new Thread[countThreads];

        for (int i = 0; i < countThreads; i++){
            threads[i] = new Thread(() -> {
                for (int j = 0; j < incrementThreads; j++) {
                    counter.increment();
                }
            });
       threads[i].start();
       threads[i].join();
        }
        System.out.println("Итоговое значение счётчика: " + counter.getCount());

    }
}
