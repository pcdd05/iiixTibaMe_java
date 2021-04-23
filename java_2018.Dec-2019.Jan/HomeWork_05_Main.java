package xxx;

import java.util.Scanner;

public class HomeWork_05_Main {
	public static void main (String[] args) {
		System.out.println("請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形");
		//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
		int width, height;
		Scanner a =new Scanner(System.in);
		System.out.println("請輸入方塊寬度：");
		width =a.nextInt();
		System.out.println("請輸入方塊長度：");
		height =a.nextInt();
		
		HomeWork_05_Method h1 = new HomeWork_05_Method();
		h1.starSquare(width, height);
		
		System.out.println("===================================");
		System.out.println("請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值");
		//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		HomeWork_05_Method h2 = new HomeWork_05_Method();
		h2.randAvg();
		System.out.println();	
		System.out.println("===================================");
		
		System.out.println("利用Overloading，設計兩個方法double maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳");
		//利用Overloading，設計兩個方法double maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		System.out.println("兩個二維陣列的最大值回傳：");
		HomeWork_05_Method h3 = new HomeWork_05_Method();
		System.out.println((int)h3.maxElement(intArray));
		System.out.println(h3.maxElement(doubleArray));
		
		
		}
		
	}


