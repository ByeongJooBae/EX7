package EX7;
public class ex07 {
	public static void main(String[] args) {
		printtime p1 = new printtime(3);
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");
		th1.setPriority(Thread.MAX_PRIORITY - 1);
		th1.start();
		printtime p2 = new printtime(6);
		Thread th2 = new Thread(p2, "�ݰ����ϴ�!");
		th1.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
