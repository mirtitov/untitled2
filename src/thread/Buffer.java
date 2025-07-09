package thread;

import java.util.*;

class Buffer {
    private final List<Integer> buffer;
    private final int capacity;

    public Buffer(int capacity) {
        this.buffer = new ArrayList<>();
        this.capacity = capacity;
    }

    public synchronized void add(int number) throws InterruptedException {
        while (buffer.size() == capacity) {
            wait();
        }
        buffer.add(number);
        System.out.println("Добавлено: " + number);
        notifyAll();
    }

    public synchronized int remove() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait();
        }
        int number = buffer.remove(0);

        System.out.println("Извлечено: " + number);
        notifyAll();


        return number;
    }
}





