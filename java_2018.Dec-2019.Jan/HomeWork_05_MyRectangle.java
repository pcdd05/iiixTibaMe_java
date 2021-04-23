package xxx;
//請設計一個類別MyRectangle
public class HomeWork_05_MyRectangle {
//有兩個double型態的屬性為width, depth
private double width;
private double depth;
	//有三個方法
	public void setWidth(double width){
		this.width =width;
	}
	public void setDpeth(double depth){
		this.depth =depth;
	}
	public double getArea(){
		return (width * depth);
	}
	
	//有兩個建構子
	public HomeWork_05_MyRectangle() {	
	
	}
	
	public HomeWork_05_MyRectangle(double width, double depth) {	
		this.width=width;
		this.depth=depth;
	}
	
	
}
