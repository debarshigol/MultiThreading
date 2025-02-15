package ThreadType99;

public class HelloThread extends Thread{
    private final int ThreadNum;

    public HelloThread(int threadNum) {
        ThreadNum = threadNum;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from Thread-"+ThreadNum);
        }
    }
}
