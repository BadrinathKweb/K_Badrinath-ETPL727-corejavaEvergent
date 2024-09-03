package Com.evergent.corejava.casestudy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class SupportTicketSystem {
	Deque <String> asq=null;
	public SupportTicketSystem() {
		asq=new ArrayDeque<String>();
	}
	public void addTicket(String ticket) {
		System.out.println("Added ticket: "+ticket);
		asq.add(ticket);
	}
	public String processNextTicket() {
		if(asq.isEmpty()) {
			return "queue is empty";
		}
		return asq.poll();
	}
	public String peekNextTicket(){
		if(asq.isEmpty()) {
			return "queue is empty";
		}
		return asq.peek();
	}
	public void displayQueue() {
		if(asq.isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			for(String s:asq) {
				System.out.println("ticket is: "+s);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SupportTicketSystem s1 = new SupportTicketSystem();
		for(;;){
			System.out.println("1.Add Ticket");
			System.out.println("2.Process to the next ticket");
			System.out.println("3.View next ticket");
			System.out.println("4.Display ticket queue");
			System.out.println("5.Exit");
			int no=sc.nextInt();
			sc.nextLine();
			switch(no){
			case 1:
				System.out.println("enter the ticket");
				String ms = sc.nextLine();
				s1.addTicket(ms);
				break;
			case 2:
				System.out.println(s1.processNextTicket());
				break;
			case 3:
				System.out.println(s1.peekNextTicket());
				break;
			case 4:
				s1.displayQueue();
				break;
			case 5:
				System.exit(0);
			
		}
		
	}
	}
}
