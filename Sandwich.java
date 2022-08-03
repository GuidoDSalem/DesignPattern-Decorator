
public abstract class Sandwich {
	String description;
	int cost;
	
	public abstract String getDescription();
	public abstract int getCost();
	public void display() {
		System.out.println(this.getDescription());
		System.out.println("Total:\t\t$" + this.getCost());
	};

}
