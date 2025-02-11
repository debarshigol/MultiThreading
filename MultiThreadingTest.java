package MultiThreadingTest;

public class MultiThreadingTest {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("MultiThreading concept");
		FirstTask t1 = new FirstTask();
		SecondTask t2 = new SecondTask();
		ThirdTask t3 = new ThirdTask();
		
		t1.start();
		t2.start();
		t3.start();
		
		long endTime = System.currentTimeMillis();
		System.out.println(" ");
		System.out.println("Total time taken: "+(endTime-startTime));
		

	}

}
