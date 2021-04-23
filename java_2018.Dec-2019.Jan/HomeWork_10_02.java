package xxx;

import java.util.Scanner;

public class HomeWork_10_02 {
//請設計一隻程式，讓使用者可以輸入一個任意數後，可以選擇要以下列何種表示方法顯示(1)千分位(2)百分比(3)科學記號，
//而輸入非任意數會顯示提示訊息 (提示：TestFormatter.java, Java API文件, 判斷數字可用正規表示法)
	public static void main (String[] args) {	
		String regex = "[0-9]+";
		String enter = null;
		double data = 0;
		while (enter == null) {
			System.out.println("請輸入數字：");
			Scanner sc1 = new Scanner(System.in);
			enter = sc1.next();
			sc1.close();
		if (! enter.matches(regex)) {
			enter = null;
			System.out.println("數字格式不正確，請再輸入一次！");
		}else {data = Double.parseDouble(enter);
			break;}
		}
		
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號");
			Scanner sc2 = new Scanner(System.in);
			int f = sc2.nextInt();
			sc2.close();
		if (f == 1) {
			System.out.printf("格式化為千分位數字：%,.0f \n", data);}
		else if (f == 2) {
			System.out.printf("格式化為百分比數字：%.0f%% \n", data);}
		else if (f == 3) {
			System.out.printf("格式化為科學記號數字：%.1E \n", data);}
	}

}
