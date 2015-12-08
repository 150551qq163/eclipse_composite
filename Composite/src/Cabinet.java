
public class Cabinet extends CompositeEquipment {
	public static double cabinetPrice=3.0;
	public static double cabinetDiscountPrice=3.0;
	public Cabinet(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double netPrice() {
		// TODO Auto-generated method stub
		return cabinetPrice+super.netPrice();
	}
	@Override
	public double discountPrice() {
		// TODO Auto-generated method stub
		return cabinetDiscountPrice+super.discountPrice();
	}
	
}
