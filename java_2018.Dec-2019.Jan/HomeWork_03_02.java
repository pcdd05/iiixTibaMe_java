package xxx;

import java.util.Scanner;

public class HomeWork_03_02 {
	public static void main (String[] args) {
		int ans;
		System.out.println(" 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜 錯會顯示錯誤訊息，猜對則顯示正確訊息");
		// 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜 錯會顯示錯誤訊息，猜對則顯示正確訊息
		ans = (int) (Math.random() *10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~9)：");
		for (int x=0; x!=ans;) {
			if (sc.hasNextInt()) {
			x = sc.nextInt();	
			} else {System.out.println("請輸入整數！");
			break;}
			if (x == ans) {
			System.out.println("答對了！答案就是"+ans);
			break;}
			else {System.out.println("猜錯囉！");}	
		}
		
		System.out.println("=================================");
		
		int ans100;
		System.out.println("產生0～100亂數，每次猜就會提示你是大於還是小於正確答案");
		// 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
		ans100 = (int) ((Math.random() *101));
		Scanner sc1 = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~100)：");
		for (int y=0; y!=ans100;) {
			if (sc1.hasNextInt()) {
				y= sc1.nextInt();
			} else {System.out.println("請輸入整數！");
			break;}
			if (y > ans100) {
			System.out.println("猜低一點！");
			}
			else if (y < ans100) {
			System.out.println("猜高一點！");
			}
			else if (y == ans100) {
			System.out.println("答對了！答案就是"+ans100);
			break;}
		}
	}
}

