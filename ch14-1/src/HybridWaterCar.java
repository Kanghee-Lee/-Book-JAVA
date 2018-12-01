
public class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	public HybridWaterCar(int gas, int elec, int water) {
		super(gas, elec);
		this.waterGauge = water;
	}
	
	public void show() {
		System.out.println("잔여 가솔린 : " + gasolineGauge);
		System.out.println("잔여 전기량 : " + electricGauge);
		System.out.println("잔여 워터량 : " + waterGauge);
	}
}
