
// Single block
public class Block implements Group {
	
	int width;
	int length;
	Group parent;
	
    public Block(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

 // assemble method should treat both single and group of blocks same.
    public void assemble() {
        System.out.println("Adding a block of "+ this.width +"X"+ this.length);
    }
}