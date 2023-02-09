import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {

        CountDownLatch cdl = new CountDownLatch(5);
        double[] arrNew = new MyThread(cdl).getArr();

        try {
            cdl.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i]/2);
        }
    }
}
