
/**
 * @author Dinesh Gawas
 *
 */
public class Locker extends Wardrobe_decorator{
	
	public Locker(Basic_Wardrobes bw) {
		this.bw = bw;
	}

	@Override
	public String getdescription() {

		return bw.getDescription() + ", Locker ";
	}

	@Override
	public double cost() {

		return bw.cost() +  5000;
	}

}
