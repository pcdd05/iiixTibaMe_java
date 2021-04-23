package xxx;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class HomeWork_07_05_Read {
//承上題，請寫一個程式，能讀出Object.dat這四個物件，並執行speak()方法 觀察結果如何 (請利用多型簡化本題的程式設計) 
	public static void main (String[] args) throws IOException, Exception{
		File Object = new File ("C:\\data\\Object.dat");
		FileInputStream fis = new FileInputStream (Object);
		ObjectInputStream ois = new ObjectInputStream (fis);
		System.out.println(Object.getName() + "檔案內容如下: ");
		System.out.println("--------------------");
		try {
			while(true) {
				((HomeWork_07_05_Animal)ois.readObject()).speak();
 			}
		}
			catch (EOFException e) {
				System.out.println("--------------------");}
		ois.close();
		fis.close();			
			}

}

