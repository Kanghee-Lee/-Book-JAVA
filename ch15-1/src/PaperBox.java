
public class PaperBox extends Box{
	public void paperWrap() { System.out.println("papaer wrap"); }
	public void wrap() { paperWrap(); }
}
