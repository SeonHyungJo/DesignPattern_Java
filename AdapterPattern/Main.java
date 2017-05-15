package AdapterPattern;

public class Main {

	public static void main(String[] args) {
		Adapter adapter = new AdapterImpi();
		
		System.out.println(adapter.twiceOf(100f));
		System.out.println(adapter.halfOf(80f));
	}

}
