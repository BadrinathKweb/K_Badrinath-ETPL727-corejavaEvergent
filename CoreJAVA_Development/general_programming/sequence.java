package Com.evergent.corejava.general_programming;

public class sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
        int a=65,r=0;
        int b=0;
        while(a<'Z' && b<'Z' && k<4) {
        	b=k+a;
        	//System.out.println((char)a+""+(char)b);
        	System.out.println((a-65)+" "+(b-65));
        	r=a;
        	a=a+k-1;
        	k=k+1;
        }
        a=r;
        while(a<(int)'Z'-4) {
        	b=b+2;
        	a=a+2;
        	//System.out.println((char)a+""+(char)b);
        	System.out.println((a-65)+" "+(b-65));
        	
        }
	}

}
