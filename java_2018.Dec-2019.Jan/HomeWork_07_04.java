package xxx;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HomeWork_07_04 {
//請設計一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個 參數所代表的檔案會複製到第二個參數代表的檔案
	public static void copyFile(File f1, File f2) throws IOException {
//		FileInputStream fis = new FileInputStream(f1);
		FileReader fr = new FileReader(f1);
//		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedReader br = new BufferedReader(fr);
//		InputStreamReader isr = new InputStreamReader(bis);
//		FileOutputStream fos = new FileOutputStream(f2);
		FileWriter fw = new FileWriter(f2);
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedWriter bw = new BufferedWriter(fw);
//		OutputStreamWriter osw = new OutputStreamWriter(bos);
		
		int i;
		while((i=br.read())!=-1) {
			bw.write(i);
			System.out.flush();
		}
				
//		osw.close();
//		bos.close();
		bw.close();
//		fos.close();
		fw.close();
//		isr.close();
//		bis.close();
		br.close();
//		fis.close();
		fr.close();
	}
	public static void main (String[] args) throws IOException {
		File f1 = new File("D:\\CA107_Workspace\\JAVA\\Homework\\Homework_07_04_1.txt");
		File f2 = new File("D:\\CA107_Workspace\\JAVA\\Homework\\Homework_07_04_2.txt");
		copyFile(f1, f2);
	}

}
