package xxx;

public class HomeWork_05_adv {
//請設計一個方法void genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫與數字的亂數組
	
	public void genAuthCode() {
		int[]code=new int[8];
		int r;
		for (int i=0;i<code.length;i++) {
			while(true) {
			r=(int)(Math.random()*75)+48;
			if ((47<r&&r<58) || (64<r&&r<91) || (96<r&&r<123)) {
				code[i]=r;
				System.out.print((char)code[i]);
				break;}
			} 
		}
	}

	public static void main (String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		HomeWork_05_adv x= new HomeWork_05_adv();
		x.genAuthCode();
	}
	
	
}
