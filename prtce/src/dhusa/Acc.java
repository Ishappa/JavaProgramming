package dhusa;

public class Acc implements Accont {

	String name;
	double accbal;
	int accno;
	//private static int ranum = 101;
	
	public Acc(int accno,String name,double accbal){
		super();
		this.name=name;
		this.accbal=accbal;
		//this.accno= ranum++;
		this.accno=accno;
		
	}
	
	
	@Override
	public void deposite(double amount) {
		System.out.println("deposite "+amount+"Rs");
		 accbal=accbal+amount;
		
	}
	@Override
	public void withdraw(double amount) {
		 System.out.println("withdrwa amount is "+amount);
		 accbal=accbal-amount;
		
	}
	@Override
	public void viewBalance() {
		 System.out.println(accbal);
		
	}
	public static void main(String[] args) {
	
		Acc a = new Acc(101, "Isha", 2000);
		a.viewBalance();
		a.withdraw(1000);
		a.viewBalance();
		
	}
	
	
}
