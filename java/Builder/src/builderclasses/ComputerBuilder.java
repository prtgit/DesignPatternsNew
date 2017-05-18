package builderclasses;

public class ComputerBuilder implements PCBuilder {
	private Computer computer;
	public ComputerBuilder(){
		computer = new Computer();
	}

	@Override
	public ComputerBuilder addMonitor(int size) {
		Monitor m= new Monitor(size);
		computer.addMonitor(m);
		return ________; //>>1. Blank for return statement
	}

	
	@Override
	public ComputerBuilder addMouse(String type) {
		Mouse m = new Mouse(type);
		computer.addMouse(m);
		return ________; //>>2. Blank for return statement
	}
	@Override
	public ComputerBuilder addRAM(int size){
		RAM r = new RAM(size);
		computer.addRAM(r);
		return ________; //>>3. Blank for return statement
		
	}
	@Override
	public ComputerBuilder addHardDisk(int size){
		HardDisk h = new HardDisk(size);
		computer.addHardDisk(h);
		return ________; //>>4. Blank for return statement
	}
	
	
	public ComputerBuilder addRAMArray(){
		computer.addRAMArray();
		return ________; //>>5. Blank for return statement
	}
	
	public ComputerBuilder addHDDArray(){
		computer.addHDDArray();
		return ________; //>>6. Blank for return statement
	}
		
	public Computer getComputer(){
		return computer;
	}
}
