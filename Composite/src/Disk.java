
public class Disk extends Equipment {
	public static double diskPrice=2.0;
	public static double diskDiscountPrice=1.0;
	public Disk(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		return diskPrice;
	}

	@Override
	public double discountPrice() {
		return diskDiscountPrice;
	}

}
