package Synchronization;

public class TestSync {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Count value after increment "+counter.getCount());
        System.out.println("Total time taken: "+(endTime-startTime)+" Mili_Secs");
    }
}
