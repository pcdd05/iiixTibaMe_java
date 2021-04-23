package xxx;

import java.io.Serializable;

public class HomeWork_07_05_Dog extends HomeWork_07_05_Animal implements Serializable{
	private String name;
	
	public HomeWork_07_05_Dog() {
		
	}
	public HomeWork_07_05_Dog(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}