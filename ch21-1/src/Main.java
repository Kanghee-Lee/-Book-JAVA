
public class Main {

	public static void main(String[] args) {
		FruitBox<Orange> orbox = new FruitBox<Orange> (new Orange(10));
		Orange org = orbox.pullOut();
		org.showSugarContent();
		
		FruitBox<Apple> appbox = new FruitBox<Apple> (new Apple(20));
		Apple app = appbox.pullOut();
		app.showWeight();
	}

}
