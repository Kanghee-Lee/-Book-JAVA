
public class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	public HybridWaterCar(int gas, int elec, int water) {
		super(gas, elec);
		this.waterGauge = water;
	}
	
	public void show() {
		System.out.println("�ܿ� ���ָ� : " + gasolineGauge);
		System.out.println("�ܿ� ���ⷮ : " + electricGauge);
		System.out.println("�ܿ� ���ͷ� : " + waterGauge);
	}
}
