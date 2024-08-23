package Com.evegent.corejava.Strings;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java is a powerful language";
		String[] words=str.split(" ");
		for(String w: words) {
			System.out.println(w);
		}
			
	}

}
