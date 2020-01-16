package singleton;

public class TestDrive {

	public static void main(String[] args) {
		DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
		doubleLockSingleton.hello();
	}
}
