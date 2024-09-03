package Com.evegent.corejava.multithreading;
class mythread extends Thread{
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			
		}
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) {
		mythread mt = new mythread();
		mt.start();
		mythread mt1 = new mythread();
		mt1.start();

	}

}
