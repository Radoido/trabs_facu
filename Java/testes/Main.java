
public class Main {

    static long maior;
    static double menor;

    public static void calcula() {
        maior = 1;
        menor = 2;

        for (long i = 1; i < 1000000000; i++) {

            maior *= 27;
            menor /= 0.1;

        }

    }

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        // Perform your tasks here
        calcula();

        // Record the end time
        long endTime = System.currentTimeMillis();
        System.out.println(menor);
        System.out.println(maior);
        // Calculate the elapsed time
        long elapsedTime = endTime - startTime;

        // Print the elapsed time
        System.out.println("Elapsed time in milliseconds: " + elapsedTime);
        /*
         * Runnable a = new MyRunnable("a");
         * new Thread(a).start();
         */

        System.out.println("hello world");

    }
}
