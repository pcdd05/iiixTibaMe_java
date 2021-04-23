package xxx;

public class HomeWork_09_01 implements Runnable {
	int qty;
	String name;
	static boolean ready=false;
	
	public HomeWork_09_01() {
	}
	
	public HomeWork_09_01(int qty, String name) {
		this.qty=qty;
		this.name=name;
	}
	
	public void run() {
		qty++;
		while (!ready) {
		}
		while (qty<11) {
			int rsleep=(int)(((Math.random()*26)+5)*100);
			try {
				Thread.sleep(rsleep);
			}catch (Exception e) {
			}
			System.out.println(name+"吃第"+qty+"碗飯");
			qty++;
		}
		System.out.println(name+"吃完了！");
	}
	
	public static void main (String[] args) throws InterruptedException {
		HomeWork_09_01 r1 = new HomeWork_09_01(0,"饅頭人");
		HomeWork_09_01 r2 = new HomeWork_09_01(0,"詹姆士");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		System.out.println("-------大胃王快食比賽開始！-------");
		t1.start();
		t2.start();
		ready=true;
		t1.join();
		t2.join();
		System.out.println("-------大胃王快食比賽結束！-------");
		
	}

}
