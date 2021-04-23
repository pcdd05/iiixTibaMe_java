package xxx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class HomeWork_08_Train implements Comparable<HomeWork_08_Train> {
	//請設計一個Train類別，並包含以下屬性
	private int number;
	private String type, start, dest;
	private double price;
	// 設計對應的getter/setter方法，並透過建構子產生以下7個Train的物件，放到每小題需使用的集合裡 
	public HomeWork_08_Train() {
		
	}
	public HomeWork_08_Train(int number, String type, String start, String dest, double price) {
	setTrain(number, type, start, dest, price);	
	}
	public int getTrainNum() {
		return number;
	}
	public String getTrainType() {
		return type;
	}
	public String getTrainStart() {
		return start;
	}
	public String getTrainDest() {
		return dest;
	}
	public double getTrainPrice() {
		return price;
	}
	public void setTrain(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;		
	}
	@Override
	public int compareTo(HomeWork_08_Train o) {
		if (this.number > o.number) {
			return 1;
		} else if (this.number == o.number){
			return 0;}
		else return -1;
		}

	public static void main (String[] args) {
		TreeSet<HomeWork_08_Train> train= new TreeSet<HomeWork_08_Train>();
		HomeWork_08_Train t1 =new HomeWork_08_Train(202, "普悠瑪", "樹林", "花蓮", 400);
		HomeWork_08_Train t2 =new HomeWork_08_Train(1254, "區間", "屏東", "基隆", 700);
		HomeWork_08_Train t3 =new HomeWork_08_Train(118, "自強", "高雄", "台北", 500);
		HomeWork_08_Train t4 =new HomeWork_08_Train(1288, "區間", "新竹", "基隆", 400);
		HomeWork_08_Train t5 =new HomeWork_08_Train(122, "自強", "台中", "花蓮", 600);
		HomeWork_08_Train t6 =new HomeWork_08_Train(1222, "區間", "樹林", "七堵", 300);
		HomeWork_08_Train t7 =new HomeWork_08_Train(1254, "區間", "屏東", "基隆", 700);
		
		train.add(t1);
		train.add(t2);
		train.add(t3);
		train.add(t4);
		train.add(t5);
		train.add(t6);
		train.add(t7);
		
		//請寫一隻程式，能讓台鐵安排車次的人員取得不會重覆的Train物件(請分別用Iterator與for迴圈取值)
		//承上，Train物件不會重覆之外，還能讓班次編號由大排到小列出
		System.out.println("=====for-each=====");
		for (HomeWork_08_Train get:train) {
			System.out.println(get.getTrainNum() + "-" + get.getTrainType() + "-" + get.getTrainStart() + "-" + get.getTrainDest() + "-" + get.getTrainPrice());
		}

		System.out.println("=====Iterator=====");
		Iterator objs = train.iterator();
		while (objs.hasNext()) {
			HomeWork_08_Train get=(HomeWork_08_Train) objs.next();
			System.out.println(get.getTrainNum() + "-" + get.getTrainType() + "-" + get.getTrainStart() + "-" + get.getTrainDest() + "-" + get.getTrainPrice());
		}
		
		//因為因應年假人潮，台鐵想要再加開一個車次(116, “自強”, “高雄”, “台北”, 500)在原本7個車次的後面，請問該如何設計程式碼 
		System.out.println("=====加開車次在最末=====");
		LinkedList train2 = new LinkedList();
		train2.add(t1);
		train2.add(t2);
		train2.add(t3);
		train2.add(t4);	
		train2.add(t5);
		train2.add(t6);
		train2.add(t7);
		
		HomeWork_08_Train t8 =new HomeWork_08_Train(116, "自強", "高雄", "台北", 500);
		train2.addLast(t8);
		
		//取值用for迴圈
		System.out.println("====for====");
		for (int i=0; i<train2.size();i++) {
			HomeWork_08_Train get = (HomeWork_08_Train) train2.get(i);
			System.out.println(get.getTrainNum() + "-" + get.getTrainType() + "-" + get.getTrainStart() + "-" + get.getTrainDest() + "-" + get.getTrainPrice());
		}
		//for增強
		System.out.println("====for-each====");
		for (Object geto:train2) {
			HomeWork_08_Train get = (HomeWork_08_Train)geto;
			System.out.println(get.getTrainNum() + "-" + get.getTrainType() + "-" + get.getTrainStart() + "-" + get.getTrainDest() + "-" + get.getTrainPrice());
		}
		
		System.out.println("====Iterator====");
		Iterator getIte = train2.iterator();
		while (getIte.hasNext()) {
			HomeWork_08_Train get=(HomeWork_08_Train) getIte.next();
			System.out.println(get.getTrainNum() + "-" + get.getTrainType() + "-" + get.getTrainStart() + "-" + get.getTrainDest() + "-" + get.getTrainPrice());
		}

		
	}
}
