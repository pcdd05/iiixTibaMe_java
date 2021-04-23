package xxx;

public class HomeWork_02 {

	public static void main(String[] args) {
		System.out.println("練習作業02");
		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)");
		// 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int i, sum1 = 0;
		for (i = 2; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum1 += i;
			}
		}
		System.out.println("1～1000的偶數和=" + sum1);

		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)");
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int m, sum2 = 1;
		for (m = 1; m <= 10; m++) {
			sum2 *= m;
		}
		System.out.println("1～10的連乘積=" + sum2);

		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)");
		// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int n = 1, sum3 = 1;
		while (n <= 10) {
			sum3 *= n;
			n++;
		}
		System.out.println("1～10的連乘積=" + sum3);
		
		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，輸出結果為以下1 4 9 16 25 36 49 64 81 100");
		//請設計一隻Java程式，輸出結果為以下1 4 9 16 25 36 49 64 81 100
		int x, y=1;
		for (x=1; y<100; x++) {
			y = (int) Math.pow(x,2);
			System.out.print(y + " ");
		}
		
		System.out.println();
		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，輸出結果為1~49個位數或是十位數均無4、總共幾個?");
		//請設計一隻Java程式，輸出結果為1~49個位數或是十位數均無4、總共幾個?		
		int n10, n1;
		int amount =0;
		for (n10=0; n10<=4; n10++) {
			if (n10 == 4) {
				continue;
			}
			for (n1=0; n1<=9; n1++) {
					if (n1 == 4) {
						continue;					
					}
					if (n1 != 0 && n10 == 0) {
						System.out.print(n1 + " ");
						amount = amount+1;
					}
					else if (n10 >0) {
						System.out.print(n10 +""+n1 + " ");
						amount = amount+1;
					}
			}
								
		}
		System.out.println();
		System.out.print("總共個數："+ amount);
		
		System.out.println();
		System.out.println("=====================");
//		System.out.println("請設計一隻iJava程式，輸出結果為1~49個位數或是十位數均無4、總共幾個?");
//		//請設計一隻Java程式，輸出結果為1~49個位數或是十位數均無4、總共幾個?
//		int num;
//		for (num=0; num<=49; num++) {
//			if (num % 10 !=4 && num < 40)
//					System.out.print(num +" ");
//							}
		
		System.out.println();
		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，輸出結果為10~1降冪矩陣排列");
		//請設計一隻Java程式，輸出結果為10~1降冪矩陣排列
		int a, b ;
		for (a=10; a>=0; a--) {
			for(b=1; b<=a; b++) {
				System.out.print(b);
				}
			System.out.println();
			}
		System.out.println("=====================");
		System.out.println("請設計一隻Java程式，輸出結果為A~FFFFFF升冪矩陣排列");
		//請設計一隻Java程式，輸出結果為A~FFFFFF升冪矩陣排列
		int row, col;
		for (row=1; row<=6; row++) {
			for (col=1; col<=row; col++) {
		switch(row) {
				case 1:				
			System.out.print("A");
			break;
				case 2:
			System.out.print("B");
			break;
				case 3:
			System.out.print("C");
			break;
				case 4:
			System.out.print("D");
			break;
				case 5:
			System.out.print("E");
			break;
				case 6:
			System.out.print("F");
			break;
			}		
			}
		System.out.println();
			
		}
	
	}

}
