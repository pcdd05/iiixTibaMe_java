package xxx;

public class HomeWork_10_01 {
//請設計一隻程式，用亂數產生5個介於1～100之間的整數，而輸出結果可以判斷出這5個整數為是否為質數 (提示：Math類別)
	public static void main (String[] args) {
		int[] r = new int[5];
		boolean prime = true;
		for (int i=0; i<r.length;i++){
			int count = 0 ;
			r[i] = (int) (Math.random()*100)+1;
			for (int j=2; j<r[i]; j++) {
				if (r[i] % j == 0) {
					prime = false;
					count++;
				} else { prime = true;}
			} if (count > 1 ) {
				System.out.println(r[i]+"不是質數");
			} else {System.out.println(r[i]+"是質數");}
		}
	}
}

