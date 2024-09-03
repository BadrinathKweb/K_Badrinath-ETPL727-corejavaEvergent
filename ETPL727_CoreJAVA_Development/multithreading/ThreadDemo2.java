package Com.evegent.corejava.multithreading;
class mythread2 implements Runnable{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			
		}
	}
}
public class ThreadDemo2 {

	public static void main(String[] args) {
		mythread mt = new mythread();
		Thread t1=new Thread(mt);
		t1.start();
		Thread t2 = new Thread(mt);
		t2.start();

	}

}
