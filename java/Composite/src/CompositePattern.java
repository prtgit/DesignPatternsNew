public class CompositePattern {
	 public static void main(String[] args) {
	        //Initialize three blocks
		 
		 Block block1 = new Block(2,3);
	        Block block2 = new Block(1,4);
	        Block block3 = new Block(3,7);

	        //Initialize three structure
	        Structure structure = new Structure();
	        Structure structure1 = new Structure();
	        Structure structure2 = new Structure();

	        //Composes the groups
	        structure1.add(block1);
	        structure1.add(block2);

	        structure2.add(block3);

	        structure.add(structure1);
	        structure.add(structure2);

	        structure.assemble();
	    }
}