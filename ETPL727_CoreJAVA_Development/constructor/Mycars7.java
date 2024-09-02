package Com.evergent.corejava.constructor;
class Car{
	String color;
	int maxspeed;
	Car(){
		color="white";
		maxspeed=120;
	}
	Car(String color,int maxspeed){
		this.color=color;
		this.maxspeed=maxspeed;
	}
	void display() {
		System.out.println("color: "+color);
		System.out.println("maxspeed: "+maxspeed);
	
	}
}
public class Mycars7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Car();
		Car car2= new Car();
		car1.display();
		car2.display();
	}

}
