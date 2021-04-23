package xxx;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class HomeWork_07_03 {
//請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt 的檔案裡 (請參考本章講義第23頁，使用append方式觀察效果) 
	public static void main (String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("D:\\CA107_Workspace\\JAVA\\Homework\\Data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps = new PrintStream(bos);
		for(int i=0;i<10;i++) {
			int x;
			x=(int)(Math.random()*1000)+1;
			ps.println(x);
		}
		ps.close();
		bos.close();
		fos.close();
	}
	
}
