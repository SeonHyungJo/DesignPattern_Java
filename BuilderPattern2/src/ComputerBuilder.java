
public class ComputerBuilder {
	
	private Computer computer;
	
	
	private ComputerBuilder(){
		computer = new Computer("default", "default", "default");
	}


	public static ComputerBuilder start() {
		
		return new ComputerBuilder();
	}


	public ComputerBuilder setCpu(String string) {
		computer.setCpu(string);
		return null;
	}


	public ComputerBuilder setRam(String string) {
		computer.setRam(string);
		return null;
	}


	public Computer build() {
		// TODO Auto-generated method stub
		return this.computer;
	}


	public ComputerBuilder setStorage(String string) {
		computer.setStorage(string);
		return null;
	}





}
