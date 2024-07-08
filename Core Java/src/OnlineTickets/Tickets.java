package OnlineTickets;

public class Tickets {
	
	int Tickets =100;
	
	void AvailableTickets() {
		System.out.println("Available Tickets : "+Tickets);
	}
	
	void BuyTickets(int n) {
		System.out.println("buying tickets: "+n);
	
		if(n<Tickets) {
			Tickets = Tickets -n;
			System.out.println("tickets buyed Successfully");
		}else{
			System.out.println("Tickets not Available");
		}
	}
	
	void CancelTickets(int n) {
		if(n<Tickets) {
			Tickets = Tickets + n;
			System.out.println("cancelled Tickets is :"+n);
		}
		
	}
	
public static void main(String[] args) {
	Tickets t= new Tickets();
	t.AvailableTickets();
	t.BuyTickets(20);
	t.AvailableTickets();
	t.CancelTickets(10);
	t.AvailableTickets();
}
}
