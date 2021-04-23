package xxx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HomeWork_07_05_Output {
//請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到 C:\data\Object.dat裡。
//注意物件寫入需注意的事項，若C:\內沒有data資料夾， 請用程式新增這個資料夾 
	public static void main (String[] args) throws IOException {
		File File = new File("C:\\data");
		if(!File.exists()) {
			File.mkdir();
		}
		File Object = new File("C:\\data\\Object.dat");
		HomeWork_07_05_Animal[] cats = new HomeWork_07_05_Animal[2];
		cats[0] = new HomeWork_07_05_Cat ("Kitty");
		cats[1] = new HomeWork_07_05_Cat ("MeowMeow");
		
		HomeWork_07_05_Animal[] dogs= new HomeWork_07_05_Animal[2];
		dogs[0]=new HomeWork_07_05_Dog ("Poopy");
		dogs[1]=new HomeWork_07_05_Dog ("WantWant");
		
		
		FileOutputStream fos = new FileOutputStream (Object);
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		for (int i=0;i<cats.length;i++) {
			oos.writeObject(cats[i]);
		}
		for (int i=0;i<dogs.length;i++) {
			oos.writeObject(dogs[i]);
		}

		
		oos.close();
		fos.close();
	}

	
}
