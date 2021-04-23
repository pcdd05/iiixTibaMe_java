package xxx;

import java.io.Serializable;

public class HomeWork_07_05_Cat extends HomeWork_07_05_Animal implements Serializable{
	private String name;
	
	public HomeWork_07_05_Cat() {
		
	}
	public HomeWork_07_05_Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
