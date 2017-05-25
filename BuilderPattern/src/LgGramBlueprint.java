
public class LgGramBlueprint extends BluePrint {
	
	private Computer computer;
	
	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}
	
	@Override
	void setCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("i7");
	}

	@Override
	void setRam() {
		// TODO Auto-generated method stub
		computer.setRam("8g");
	}

	@Override
	void setStorage() {
		computer.setStorage("256g ssd");

	}

	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return computer;
	}

}
