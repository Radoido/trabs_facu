public class MyRunnable implements Runnable {
    private String a;

    public MyRunnable(String a) {
        // store parameter for later user
        this.a = a;

    }

    public void run() {
        System.out.println(a);
    }
}