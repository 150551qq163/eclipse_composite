import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class CompositeEquipment extends Equipment {
	private int i=0;
	private List<Equipment> equipments=new ArrayList<>();
	public CompositeEquipment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double netPrice() {
		double netprice = 0;
		if(this instanceof Cabinet){
			System.out.println("我是柜子的组合，柜子本身价格为"+Cabinet.cabinetPrice);
		}else if(this instanceof Chassis){
			System.out.println("我是盒子组合，盒子本身的价格为"+Chassis.chassisPrice);
		}
		Iterator <Equipment> iter=equipments.iterator();
		while(iter.hasNext()){
			Equipment equipment=iter.next();
			if(equipment instanceof Chassis){
				System.out.println("在柜子里面发现一个盒子，计算它的价格");
				netprice+=equipment.netPrice();
			}else if(equipment instanceof Disk){
				System.out.println("在盒子里发现一个硬盘，它的价格为");
				System.out.println("硬盘的价格为"+Disk.diskPrice);
				netprice+=Disk.diskPrice;
			}
		}
		return netprice;
	}
	@Override
	public boolean add(Equipment equipment) {
		if(equipment instanceof Disk&&this instanceof Chassis){
			System.out.println("在盘盒里放了一个硬盘");
		}else if(equipment instanceof Chassis&&this instanceof Cabinet){
			System.out.println("在柜子里面放了一个盘盒");
		}
		this.equipments.add(equipment);
		return true;
	}
	@Override
	public boolean remove(Equipment equipment) {
		// TODO Auto-generated method stub
		return super.remove(equipment);
	}
	@Override
	public Iterator iter() {
		// TODO Auto-generated method stub
		return equipments.iterator();
	}
	@Override
	public double discountPrice() {
		double discountPrice=0;
		Iterator<Equipment> iter=equipments.iterator();
		while (iter.hasNext()) {
			discountPrice+=(iter.next()).discountPrice();
		}
		return discountPrice;
	}
	public boolean hasNext(){
		return i<equipments.size();
		
	}
	public Object next(){
		if(hasNext()){return equipments.get(i++);}else{
			throw new NoSuchElementException();
		}
	}
}
