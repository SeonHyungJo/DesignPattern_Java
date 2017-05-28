
public class Main {

	public static void main(String[] args) {
		
		//Computer compueter = new Computer("i7", "8g", "256g");
		
		Computer computer = ComputerBuilder
		.start()
		.setCpu("i7")
		.setRam("8g")
		.setStorage("256g ssd")
		.build();
		System.out.println(computer.toString());
	}

}
