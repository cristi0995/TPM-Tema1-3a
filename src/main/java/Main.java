public class Main {
    public static void main(String args[]){
        BigBowl b = new BigBowl("111 222");
        TheCook c = new TheCook(b);
        MyThread thread1 = new MyThread(b, c, 1);
        MyThread thread2 = new MyThread(b, c, 2);
        MyThread thread3 = new MyThread(b, c, 3);
        MyThread thread4 = new MyThread(b, c, 4);
        MyThread thread5 = new MyThread(b, c, 5);
        c.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
