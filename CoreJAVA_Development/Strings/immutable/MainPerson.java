package Com.evergent.corejava.strings.immutable;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImmutable person =new PersonImmutable("Raju",22);
		System.out.println("Name: "+person.myname());
		System.out.println("Age: "+person.myage());
		
		ImmutableString p = new ImmutableString("Hello");
		System.out.println(p.myvalue());
		System.out.println(p.tostring());
	}

}
