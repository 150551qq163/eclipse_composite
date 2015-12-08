import java.util.Iterator;

public abstract class Equipment {
	private String name;
	public Equipment(String name){
		this.name=name;
	}
	public abstract double netPrice();
	public abstract double discountPrice();
	public boolean add(Equipment equipment){
		return false;
	}
	public boolean remove(Equipment equipment){
		return false;
	}
	public Iterator iter(){
		return null;
	}
}
