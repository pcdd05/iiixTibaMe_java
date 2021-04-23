package xxx;

public class HomeWork_05_MyRectangleMain {
	public static void main (String[] args) {
		//使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		System.out.println("使用public MyRectangle()建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果");
		HomeWork_05_MyRectangle r1 = new HomeWork_05_MyRectangle();
		r1.setWidth(10);
		r1.setDpeth(20);
		System.out.println(r1.getArea());
		
		System.out.println("=================");
		
		//使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果
		System.out.println("使用public MyRectangle(double width, double depth)建構子建立物件，設定width, depth為10, 20，透過getArea()印出結果");
		HomeWork_05_MyRectangle r2 = new HomeWork_05_MyRectangle(10,20);
		System.out.println(r2.getArea());
		
	}

}
