
public class Extra_shelf extends Wardrobe_decorator{

	public Extra_shelf(Basic_Wardrobes bw) {
		this.bw = bw;
	}

	@Override
	public String getdescription() {

		return bw.getDescription() + ", Extra_shelf ";
	}

	/**
	 *
	 */
	@Override
	public double cost() {

		return bw.cost() +  500;
	}
}
