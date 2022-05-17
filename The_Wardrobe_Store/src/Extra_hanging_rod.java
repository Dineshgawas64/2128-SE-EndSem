
/**
 * @author Dinesh Gawas
 *
 */
public class Extra_hanging_rod extends Wardrobe_decorator {
	
	public Extra_hanging_rod(Basic_Wardrobes bw) {
		this.bw = bw;
	}

	@Override
	public String getdescription() {

		return bw.getDescription() + ", Extra_hanging_rod ";
	}

	@Override
	public double cost() {

		return bw.cost() +  500;
	}

}
