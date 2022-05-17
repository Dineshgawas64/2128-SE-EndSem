
/**
 * @author Dinesh Gawas
 *
 */
public abstract class Wardrobe_decorator extends Basic_Wardrobes {
	
	/**
	 * 
	 */
	public Basic_Wardrobes bw;
	
	/**
	 * @return basic wardrobes
	 */
	public abstract String getdescription();
	
	/**
	 *
	 */
	public Type getType() {
		return bw.getType();
	}

}
