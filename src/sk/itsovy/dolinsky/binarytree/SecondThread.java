package sk.itsovy.dolinsky.binarytree;

/**
 * @author Martin Dolinsky
 */
public class SecondThread implements Runnable{
	private Thread t;

	@Override
	public void run() {
		System.out.println("Multiplying by 10\n" + FirstThread.getResult() * 10);
	}

	public void start() {
		if(t == null)
			t = new Thread(this);
		t.start();
	}
}
