package EX7;
import java.util.Date;
public class printtime implements Runnable {
	private int count;
	public printtime(int count) {
		this.count = count;
	}
	public void run() {
		Date current = new Date();
		while (count != 0) {
			System.out.println("¼øÀ§: " + Thread.currentThread().getPriority()
			+ " " + current.toString() + " " + Thread.currentThread().getName());
			count--;
			try {
				Thread.sleep(1000);
				current = new Date();
			} catch (InterruptedException e) {}
		}
	}
}