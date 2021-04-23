package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_04 {
	public static void main (String[] args) {
		System.out.println("請寫出一隻程式能輸出陣列所有元素的平均值與大於平均值的元素");
		//請寫出一隻程式能輸出陣列所有元素的平均值與大於平均值的元素
		
		int[] i1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum =0;
		for (int i=0; i<i1.length;i++) {
			sum += i1[i];			
		}
		int avg = (sum / i1.length);
		System.out.println("所有元素的平均值=" +avg);
		
		System.out.println("大於平均值的元素=");
		for (int j=0; j<i1.length;j++) {
			if (i1[j]> avg) {
				System.out.println(i1[j] + "  ");
			}
		}
		System.out.println();
		System.out.println("===============================");
		
		System.out.println("請建立一個字串，經過程式執行後，輸入結果是反過來的");
		//請建立一個字串，經過程式執行後，輸入結果是反過來的
		String s1[] = {"H","e","l", "l","o"," ","W","o","r","l","d"};
		for (int i=s1.length-1; i>=0;i--) {
			System.out.print(s1[i]);
			}
		System.out.println();
		System.out.println("===============================");
		
		System.out.println("有個字串陣列(八大行星)，請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)");
		//有個字串陣列(八大行星)，請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

		String[] s8={"mercury","venus","earth","mars","jupiter","saturn","uranus","neptune"} ;
		int aeiou=0;
		for(int i=0; i<s8.length;i++) {
			for(int j=0; j<s8[i].length();j++) {
				switch(s8[i].charAt(j)){
				case 'a':
					aeiou=aeiou+1;
					break;
				case 'e':
					aeiou=aeiou+1;
					break;
				case 'i':
					aeiou=aeiou+1;
					break;
				case 'o':
					aeiou=aeiou+1;
					break;
				case 'u':
					aeiou=aeiou+1;
					break;
				}
			}
		}
		System.out.println("八大行星字串陣列共有"+aeiou+"個母音(a,e,i,o,u)");				
		System.out.println("===============================");
		
		System.out.println("請設計一個程式,可以讓小文輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數");
		//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事有錢可借他;並且統計有錢可借的總人數
		int[][] c1= { 
						{25, 32, 8, 19, 27},
						{2500, 800, 500, 1000, 1200}
		};
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入小文欲借的金額=");
		int m1=sc.nextInt();
		System.out.println("有錢可借的員工編號:");
		for (int i=0; i<c1[1].length; i++) {
			if(m1<=c1[1][i]) {
				count += 1;
				System.out.print(c1[0][i]+"  ");
			}
		}
		System.out.print("共"+count+"人！");
		System.out.println();
		System.out.println("===============================");
		
		System.out.println("請設計一隻程式由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，它會顯示是該年的第幾天");
		//請設計一隻程式由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，它會顯示是該年的第幾天
		int[] d1= {31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner dsc = new Scanner(System.in);
		System.out.println("請輸入西元年(yyyy)=");
		int yy=dsc.nextInt();
		System.out.println("請輸入月(mm)=");
		int mm=dsc.nextInt();
		int dd;
		if (mm!=2) {
			System.out.println("請輸入日(dd)=");
			dd=dsc.nextInt();}
		else {
			for (dd=0; dd==0;) {
			System.out.println("請輸入日(dd)=");
			dd=dsc.nextInt();
			if(dd>28) {
				dd=0;
				System.out.println("2月日期應小於29日，請重新輸入");
			} else break;
			}
		}	
		int dnum = 0;
		for (int i=0;i<mm-1;i++) {
				dnum += d1[i];
			}
		dnum += dd;
		
		if(mm>2) {
			if((yy%4==0 && yy%100!=0)||yy%400==0) {
			dnum+=1;
		}
			}
		
		System.out.println("西元"+yy+"年，第"+ dnum +"天");
		System.out.println("===============================");
		
		System.out.println("班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數");
		//班上有8位同學，他們進行了6次考試，請算出每位同學考最高分的次數
		int[][]exam= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75},
				};
		
		int count1;
		int hs=0;	
		int[] student= new int[8];
			for (int i=0;i<6;i++) {
				for (int j=0;j<8;j++) {
					count1=0;
					for (int k=0; k<8; k++) {
						if(exam[i][j] > exam[i][k]) {
							count1=count1+1;
							if (count1==7) {
								hs=j;
								student[hs]+=1;
							}
						}
					}
				}
				
			}
		System.out.println("1號同學考最高分次數="+student[0]);
		System.out.println("2號同學考最高分次數="+student[1]);
		System.out.println("3號同學考最高分次數="+student[2]);
		System.out.println("4號同學考最高分次數="+student[3]);
		System.out.println("5號同學考最高分次數="+student[4]);
		System.out.println("6號同學考最高分次數="+student[5]);
		System.out.println("7號同學考最高分次數="+student[6]);
		System.out.println("8號同學考最高分次數="+student[7]);
	}
}
	
		

		
		
		


		
		
		
		
		
		
		
		

