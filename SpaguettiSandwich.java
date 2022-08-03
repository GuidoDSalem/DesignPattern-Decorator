
public class SpaguettiSandwich extends Sandwich {
	
	public SpaguettiSandwich() {
		this.cost = 9;
		this.description = "Spaguetti Sandwich:\t"+this.cost +"\n";
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.cost;
	}

}
