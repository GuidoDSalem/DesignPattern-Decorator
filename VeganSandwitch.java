
public class VeganSandwitch extends Sandwich {
	
	public VeganSandwitch() {
		this.cost = 7;
		this.description = "Vegan Sandwich:\t"+this.cost +"\n";
		
	}

	@Override
	public String getDescription() {
		
		return this.description;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}
