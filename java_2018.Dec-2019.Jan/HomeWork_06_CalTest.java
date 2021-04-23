	package xxx;

import java.util.Scanner;
//請設計兩個類別CalException.java與CalTest.java，在CalTest.java裡有個自 訂方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。
//使用者可以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：  
//1. x與y同時為0，(產生CalException的例外物件)      
//2. y為負值，而導致x的y次方結果不為整數      
//3. x與y皆正確情況下，會顯示運算後結果 
public class HomeWork_06_CalTest {
	static int x, y;
	
	public static double powerXY(int x, int y) throws HomeWork_06_CalException{
			try {
				if (x==0 && x==y) {
					HomeWork_06_CalException ce = new HomeWork_06_CalException("0的0次方沒有意義！");
					throw ce;
					}
				else if (y<0) {
					HomeWork_06_CalException ce = new HomeWork_06_CalException("次方為負值，結果回傳不為整數！");
					throw ce;
					}
			}catch(HomeWork_06_CalException ce){
				System.out.println(ce.getMessage());
				return (0);
				}
			
		return (Math.pow(x, y));
	}
	
	public static void ScannerXY() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入X的值：");
			if(sc.hasNextInt()) {
			 x=	sc.nextInt();
			 break;
			}else System.out.println("輸入格式不正確");
			}
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入y的值：");
			if(sc.hasNextInt()) {
			 y=	sc.nextInt();
			 break;
			}else System.out.println("輸入格式不正確");
			}
	}
	public static void main (String[] args) throws HomeWork_06_CalException {
		while(true) {
		double a;
		ScannerXY();		
		a = powerXY(x,y);
		if (a!=0) {
			System.out.println(x+"的"+y+"次方等於"+a);
			break;}else break;
		
		}
	}
}

