package xxx;

import java.util.Arrays;

public class HomeWork_05_Method {
	//請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形
	public void starSquare(int width, int height) {
		for (int i=0;i<height;i++) {
			for(int j=0; j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public void randAvg() {
		int r;
		int[] rArray = new int[10];
		int sum=0;
		System.out.println("本次亂數結果：");
		for (int i=0; i<10;i++) {
			r=(int)(Math.random()*101);
			rArray[i]=r;
			System.out.print(r + " ");
			sum += rArray[i];
		}
		System.out.println();
		System.out.print("平均值：" + (sum/rArray.length));
	}
	//利用Overloading，設計兩個方法double maxElement(int x[][])與double maxElement(double x[][])，可以找出二維陣列的最大值並回傳
	public double maxElement(int[][] x) {
		int max;
		Arrays.sort(x[0]);
		Arrays.sort(x[1]);
		if(x[0][2]>x[1][2]) {
			max=x[0][2];
			} else max=x[1][2];
		return max;
		}
	
	public double maxElement(double[][] x) {
		double max;
		Arrays.sort(x[0]);
		Arrays.sort(x[1]);
		if(x[0][2]>x[1][2]) {
			max=x[0][2];
			} else max=x[1][2];
		return max;
		}
}
