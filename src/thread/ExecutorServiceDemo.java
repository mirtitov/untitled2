package thread;

import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {

                System.out.println("Задача " + taskId +
                        " выполняется потоком: " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();

        try {

            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println("Не все задачи завершены в течение 60 секунд.");
            }
        } catch (InterruptedException e) {
            System.err.println("Основной поток был прерван.");
        }

        System.out.println("Пул потоков завершил свою работу.");
    }
}

