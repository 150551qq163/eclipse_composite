
public class Client {

	public static void main(String[] args) {
		Cabinet cabinet=new Cabinet("機箱");
		Chassis chassis=new Chassis("硬盤盒");
		cabinet.add(chassis);
		chassis.add(new Disk("硬盤"));
		System.out.println("柜子组合的价格"+cabinet.netPrice());
		System.out.println("柜子组合的折扣价格"+cabinet.discountPrice());
	}

}
