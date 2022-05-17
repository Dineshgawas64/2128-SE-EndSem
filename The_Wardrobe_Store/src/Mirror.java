
/**
 * @author Dinesh Gawas
 *
 */
public class Mirror extends Wardrobe_decorator {

	public Mirror(Basic_Wardrobes bw) {
		this.bw = bw;
	}

	@Override
	public String getdescription() {

		return bw.getDescription() + ", Mirror ";
	}

	@Override
	public double cost() {

		return bw.cost() +  4000;
	}

}
