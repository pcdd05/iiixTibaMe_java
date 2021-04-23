package xxx;

class Bank{
	int balance = 0;
	boolean dead = true;
	synchronized public void deposit(int money) {
		for (int i=0; i<10; i++) {
			if(balance>2000 && dead==true) {
				System.out.println("媽媽看到餘額在2000以上，暫停匯款");
				try {
					wait();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if (balance <1000) {
				System.out.println("媽媽被熊大要求匯款");
			}
			balance+=money;	
			System.out.println("媽媽存了2000，帳戶共有："+balance);
			notify();
			if (i==9) {
				dead=false;
			}
		}
	}
	
	synchronized public void withdraw(int money) {
		for (int j=0; j<10; j++) {
			if (balance < 1000 && dead==true) {
				System.out.println("熊大看到帳戶沒錢，暫停提款");
				try {
					wait();
				}catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			if (balance>2000) {
				System.out.println("熊大被老媽告知帳戶已經有錢！");
				}
			balance-=money;
			System.out.println("熊大領了1000，帳戶共有："+balance);
			notify();
			if (j==9) {
				dead=false;
			}
		}
	}
}
	
class Tmom extends Thread{
	Bank money;
	public Tmom(Bank money) {
		this.money=money;
	}
	public void run() {
		money.deposit(2000);
		
	}
}

class Tbear extends Thread{
	Bank money;
	public Tbear(Bank money) {
		this.money=money;
	}
	public void run() {
		money.withdraw(1000);
	}
}

public class HomeWork_09_02{
	public static void main (String[] args) {
		Bank money = new Bank();
		Tmom mom = new Tmom(money);
		Tbear bear = new Tbear(money);
		mom.start();
		bear.start();
	}
}


	

