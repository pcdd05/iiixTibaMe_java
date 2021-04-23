package xxx;

import java.io.Serializable;

public abstract class HomeWork_07_05_Animal implements Serializable {

		private String name;
		
		public HomeWork_07_05_Animal () {
			
		}
		
		public HomeWork_07_05_Animal (String name) {
			this.name=name;
		}
		
		public abstract void speak();
		
	
}
