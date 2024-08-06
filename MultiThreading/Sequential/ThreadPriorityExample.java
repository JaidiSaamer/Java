package MultiThreading.Sequential;

public class ThreadPriorityExample {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());


        System.out.println(Thread.currentThread().getName()+"Says Hi!");

        Thread one = new Thread(()->{
            System.out.println("Thread one says Hi as well!");
        });

        one.setPriority(Thread.MAX_PRIORITY);
        one.start();
    }
    
}
