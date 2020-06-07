package sk.itsovy.dolinsky.binarytree;

/**
 * @author Martin Dolinsky
 */
public class FirstThread extends Thread {
	private Thread t;
	private static int result;

	public void run() {
		System.out.println("Sum of 5 + 5");
		result = 5 + 5;
		System.out.println(result);
	}

	public void start() {
		if(t == null)
			t = new Thread(this);
		t.start();
	}

	public static int getResult() {
		return result;
	}
}

