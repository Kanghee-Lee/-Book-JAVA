
public class GoldPaperBox extends PaperBox {
	public void goldWrap() { System.out.println("gold wrap"); }
	public void wrap() { goldWrap(); }
}
