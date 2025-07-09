package thread;



public class MyThread extends Thread{
    private String name;

    public MyThread (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Тема " + name + " говорит: Привет из темы!");
    }
}
