package xxx;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork_07_02 {
	//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料     
	//(分別使用FileInputStream, FileReader, BufferedReader處理) 
	public static void main (String[] args) throws IOException {
		File inputfile = new File("D:\\CA107_Workspace\\JAVA\\Homework\\sample.txt");
				
		int bytecount=0;
		FileInputStream fis = new FileInputStream("D:\\CA107_Workspace\\JAVA\\Homework\\sample.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		while (bis.read() != -1) {
			bytecount++;}
		bis.close();
		fis.close();
		
		int charcount=0;
		int rowcount=0;
		while(rowcount==0) {
		FileReader fr = new FileReader("D:\\CA107_Workspace\\JAVA\\Homework\\sample.txt");
		BufferedReader br = new BufferedReader (fr);
		if (charcount==0) {
		while (br.read() != -1) {
			charcount++;}
		}else {
		while(br.readLine() != null) {
			rowcount++;}
		}
		br.close();
		fr.close();
		}
		

		System.out.print(inputfile.getName()+"檔案共有"+bytecount+"個位元組，"+charcount+"個字元，"+rowcount+"列資料");
	}
}
