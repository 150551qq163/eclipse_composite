
public class Chassis extends CompositeEquipment {
	public static double chassisPrice=2.5;
	public static double chassisDiscountPrice=2.5;
	public Chassis(String name) {
		super(name);
	}
	@Override
	public double netPrice() {
		// TODO Auto-generated method stub
		return chassisPrice+super.netPrice();
	}
	@Override
	public double discountPrice() {
		// TODO Auto-generated method stub
		return chassisDiscountPrice+super.discountPrice();
	}

}
