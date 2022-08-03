
public class MeetSandwitch extends Sandwich {
		
	public MeetSandwitch() {
		this.cost = 10;
		this.description = "Meet Sanditch:\t\t$"+this.cost +"\n";
		
	}

	@Override
	public String getDescription() {

		return this.description;
	}

	@Override
	public int getCost() {
		
		return 10;
	}

}
