package Com.evergent.corejava.LogicalPrograms;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int ans=1;
		if(n==0) {
			System.out.println(ans);
		}
		else {
			for(int i=1;i<=n;i++) {
				ans=ans*i;
			}
			System.out.println(ans);
		}

	}

}
