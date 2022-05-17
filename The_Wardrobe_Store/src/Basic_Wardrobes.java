
/**
 * @author Dinesh Gawas
 *
 */
public abstract class Basic_Wardrobes {
	/**
	 *  type
	 */
	
	public enum Type{/**
		 * @type
		 */Two_door,/**
		 * @type
		 */Three_door};
	/**
	 *  type
	 */
	Type type = Type.Two_door;
	String description = "unknown Wardrobe";
	/**
	 * @return type
	 */
	public String getDescription() {
		return description;
	}
	/**
	 *  type
	 */
	public void setType(Type Type) {
		this.type = Type;
	}
	
	/**
	 * @return type
	 */
	public Type getType() {
		return this.type;
	}
 
	/**
	 * @return s
	 */
	public abstract double cost();
}
