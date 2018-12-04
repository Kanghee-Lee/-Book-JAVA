
public class FruitBox<T> {
	T item;
	
	public FruitBox(T fruit) {
		item = fruit;
	}
	
	public void store(T item) {
		this.item = item;
	}
	
	public T pullOut() {
		return item;
	}
}

class Orange {
	int sugarContent;
	public Orange(int sugar) { sugarContent = sugar; }
	
	public void showSugarContent() {
		System.out.println("당도 : " + sugarContent);
	}
}

class Apple {
	int weight;
	public Apple(int weight) {this.weight = weight; }
	
	public void showWeight() {
		System.out.println("무게 : " + weight);
	}
}
