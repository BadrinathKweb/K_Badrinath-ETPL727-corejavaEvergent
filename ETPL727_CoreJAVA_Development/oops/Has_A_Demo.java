package Com.evergent.corejava.oops;

public class Has_A_Demo {
	public void mydata() {
		System.out.println("HAS_A mydata");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Has_A_Demo as= new Has_A_Demo();
		as.mydata();
		Person p= new Person();
		p.display();
	}

}
