import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable {
    CountDownLatch latch;
    double [] arr = new double[5];
    Scanner scanner = new Scanner(System.in);

    MyThread(CountDownLatch c){
        latch = c;
        new Thread(this).start();
    }

    public double[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextDouble();
            latch.countDown();
        }
    }
}
