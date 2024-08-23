package Com.evergent.corejava.general_programming;

public class EnumDemo1 {
	enum color{
		Red,Green,Blue;
	}
	enum News{
		North,South,East,West;
	}
	enum AbcProducts{
		Laptops,desktops,Tape;
	}
	enum Days{
		Mon,Tue,Wed,Thu,Fri,Sat,Sun;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		color c=color.Red;
		System.out.println(c);
		News s= News.South;
		System.out.println(s);
		AbcProducts a= AbcProducts.desktops;
		System.out.println(a);
	}

}
