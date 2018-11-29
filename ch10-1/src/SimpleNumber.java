
public class SimpleNumber {
	int num=0;
	
	private SimpleNumber(){}
	
	public void addNum(int n) {
		num+=n;
	}
	
	public void showNum() {
		System.out.println(num);
	}
	public static SimpleNumber isNull;
	public static SimpleNumber getSimpleNumberInst(){
		if(isNull==null){
			isNull = new SimpleNumber();
		}
		
		return isNull;
	}
}
