
/**
 * @author Dinesh Gawas
 *
 */
public class Drawer extends Wardrobe_decorator{
	
	public Drawer(Basic_Wardrobes bw) {
		this.bw = bw;
	}

	@Override
	public String getdescription() {

		return bw.getDescription() + ", Drawer ";
	}

	@Override
	public double cost() {

		return bw.cost() +  2000;
	}

}
