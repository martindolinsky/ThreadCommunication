package sk.itsovy.dolinsky.binarytree;

public class Main {
	public static void main(String[] args) {
		new FirstThread().start();
		new SecondThread().start();
	}
}
