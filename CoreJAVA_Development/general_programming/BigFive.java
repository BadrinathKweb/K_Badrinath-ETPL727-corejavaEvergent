package Com.evergent.corejava.general_programming;

public class BigFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3,d=4,e=5;
		if (a>b && a>c && a>d && a>e ) {
			System.out.println("A is bigger");
		}
		else if (b>c && b>d && b>e ) {
			System.out.println("B is bigger");
		}
		else if (c>d && c>e ) {
			System.out.println("C is bigger");
		}
		else if (d>e ) {
			System.out.println("D is bigger");
		}
		else  {
			System.out.println("E is bigger");
		}
	}

}
