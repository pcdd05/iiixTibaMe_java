package xxx;

import java.util.Scanner;

public class HomeWork_03_01 {
	public static void main (String[] args) {
		int[] l = new int [3];
		
		System.out.println("請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三 角形、其它三角形或不是三角形");
		//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三 角形、其它三角形或不是三角形
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三邊長：");
		if (sc.hasNextInt()) {
			l[0]=sc.nextInt();
			l[1]=sc.nextInt();
			l[2]=sc.nextInt();		
		}
		if (l[0] *l[1] *l[2] !=0) {
			if (l[0] == l[1] && l[1] == l[2]) {
				System.out.println("正三角形");
				}
			else if (l[0] == l[1] || l[1]==l[2]) {
				System.out.println("等腰三角形");
				}
			else if (Math.pow(l[0],2) == (Math.pow(l[1],2) + Math.pow(l[2],2)) 
					|| Math.pow(l[1],2) == (Math.pow(l[0],2) + Math.pow(l[2],2)) 
					|| Math.pow(l[2],2) == (Math.pow(l[1],2) + Math.pow(l[0],2))) {
				System.out.println("直角三角形");
				}
			else if (l[0] + l[1] > l[2] && l[1]+l[2]>l[0] && l[0] + l[2] > l[1])
			{System.out.println("其他三角形");}
			else {System.out.println("不是三角形");}	
		}
		else {System.out.println("不是三角形");}
	}
}
