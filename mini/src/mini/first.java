package mini;
import java.util.*;

class bankaccount{
	private String id;
	private String name;
	private double balance;
	private int i;
	bankaccount(String id,String name){
		this.id=id;
		this.name=name;
	}
	public String getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public double getbalance() {
		return balance;
	}
	public int geti() {
		return i;
	}
	public void checkbalance() {
		System.out.println("Current Balance : "+balance);
	}
	public void deposit(double amount) {
		balance =amount + balance; 
		System.out.println("Deposited ammount : "+amount+" current balaance : "+balance);
	}
	public void withdraw(double amount) {
		if(i==3) {
			balance = balance - 5;
			i=0;
		}
		if(balance<amount) {
			System.out.println("not enough balance");
		}
		else {
		balance = balance - amount -0.25; 
		System.out.println("Withdraw ammount : "+amount+"\ncurrent balaance : "+balance);
		}i++;
	}
}
public class first {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number:");
		String n = sc.nextLine();
		System.out.println("Enter account name:");
		String m = sc.nextLine();
		System.out.println("Enter PIN:");
		bankaccount b = new bankaccount(n,m);
		int pin = sc.nextInt();
			if(pin>999 && pin<10000) {
				int s=0;
				while(s==0) {
					System.out.println("1:deposit 2:withdraw 3:balance 4:pinchange");
					int p = sc.nextInt();
					if(p==1) {
						System.out.println("Enter amount to deposit : ");
						int a = sc.nextInt();
						b.deposit(a);
					}
					else if(p==2) {
						System.out.println("Enter amount to withdraw : ");
						int a = sc.nextInt();
						b.withdraw(a);
					}
					else if(p==3) {
						b.checkbalance();
					}
					else if(p==4) {
						System.out.println("Enter old pin");
						int p1=sc.nextInt();
						if(p1==pin) {
							System.out.println("Enter new pin");
							int p2=sc.nextInt();
							if(p2>999 && p2<10000) {
								System.out.println("Your Pin Was Changed successfully");
								pin=p2;
							}
							else {
								System.out.println("Valid Pin");
							}
						}
						else {
							System.out.println("wrong pin");
						}
					}
					else {
						s=1;
					}
				}
				
			}
			else {
				throw new ArithmeticException("Enter valid pin");
				
			}
	}

}