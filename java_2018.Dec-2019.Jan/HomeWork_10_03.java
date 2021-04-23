package xxx;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HomeWork_10_03 {
//請設計一隻程式，讓使用者輸入日期(年月日，例如:20110131)後，可以轉成想要的輸出格式化成(1)年/月/日(2)月/日/年(3)日/月/年三選一，
//而輸入非指定日期數字格式會顯示出提示訊息如圖(提示：TestFormatter.java, Java API文件，判斷格式可用正規表示法)
	public static void main (String[] args) {
		String regex ="\\d{4}[0-1]\\d[0-3]\\d";	
		String enter = null;
		while (enter == null) {
			System.out.println("請輸入日期(年月日，例如:20110131)：");
			Scanner sc1 = new Scanner(System.in);
			enter = sc1.next();
		if (enter.matches(regex)) {
			break;
		}else {enter = null;
		System.out.println("日期格式不正確，請再輸入一次！");}
		}
		
		DateFormat sdfm= new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = sdfm.parse(enter);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		int f=0;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年：");
		f= sc2.nextInt();
		if (f==1) {
			SimpleDateFormat sdfm1 = new SimpleDateFormat("yyyy/MM/dd");
			System.out.println(sdfm1.format(date));
		}
		if (f==2) {
			SimpleDateFormat sdfm1 = new SimpleDateFormat("MM/dd/yyyy");
			System.out.println(sdfm1.format(date));
		}
		if (f==3) {
			SimpleDateFormat sdfm1 = new SimpleDateFormat("dd/MM/yyyy");
			System.out.println(sdfm1.format(date));
		}
	}

}
