
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComputerFactory factory = new ComputerFactory();
		factory.setBlueprint(new LgGramBlueprint());
		
//		factory.serBlueprint(new MacAirBlueprint());
//		factory.serBlueprint(new SonyBlueprint());
//		Computer computer = factory.makeAndGet();
		
		factory.make();
		Computer computer = factory.getComputer();
		
		
		//Computer computer = new Computer("i7", "16g", "256g ssd");
		
		System.out.println(computer.toString());
	}

}
