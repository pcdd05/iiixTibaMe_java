package xxx;

import java.io.File;

public class HomeWork_07_01 {
	//請寫一個程式，可以在讀入一個檔案後，顯示有多少個位元組 
	public static void main (String[] args) {
		File inputfile = new File("D:\\CA107_Workspace\\JAVA\\Homework\\Homework_07.pdf");
		if (inputfile.isFile()) {
			System.out.println(inputfile.getName()+"共有"+inputfile.length()+"個位元組");
		}
	}
	
}
