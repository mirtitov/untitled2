package thread;

public class RaceConditionWithoutSynchronized {

    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        int numThreads = 10;
        int iterations = 1000;


        Thread[] threads = new Thread[numThreads];

        // Запускаем потоки
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < iterations; j++) {
                    count++;
                }
            });
            threads[i].start();
            threads[i].join();
        }

        System.out.println("Итоговое значение счётчика без синхронизации: " + count);
    }
}
