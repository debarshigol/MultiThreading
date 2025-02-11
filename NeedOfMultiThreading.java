package MultiThreading;

public class NeedOfMultiThreading {

	public static void main(String[] args) {
		// to check the current system time
		long startTime = System.currentTimeMillis();
		for (int i = 1; i <=1000 ; i++) {
			System.out.printf("%d$ ",i);
		}
		System.out.println("$ task completed");
		for (int i = 1; i <=10000 ; i++) {
			System.out.printf("%d* ",i);
		}
		System.out.println("* task completed");
		for (int i = 1; i <=10000 ; i++) {
			System.out.printf("%d# ",i);
		}
		System.out.println("# task completed");
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken: "+(endTime-startTime)+" milisecond");

	}

}
