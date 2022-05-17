
public class Wardeobe_Stores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 
		 
		Basic_Wardrobes bw = new Metal();
		System.out.println(bw.getDescription() + "$" + String.format("%.2f", bw.cost()));
		
		 
		
		Basic_Wardrobes bw2 = new Metal();
		bw2 = new Mirror(bw2);
		bw2 = new Drawer(bw2);
		bw2 = new Locker(bw2);
		System.out.println(bw2.getDescription() + "$" + String.format("%.2f", bw2.cost()));

		
	}

}
