package thread;

public class RaceConditionWithSynchronized {
    private static int count = 0;
    private synchronized static void
    increment(){
        count++;

    }

    public static void main(String[] args) throws InterruptedException {
        int numThreads = 10;
        int iterations = 1000;

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < iterations; j++) {
                    increment();
                }
            });
            threads[i].start();
            threads[i].join();
        }

        System.out.println("Итоговое значение счётчика c синхронизацией: " + count);
    }
}
