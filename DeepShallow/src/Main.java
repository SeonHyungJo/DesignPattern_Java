//PrototypePattern2 자바의  복사
public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat navi = new Cat();
		navi.setName("navi");
		navi.setAge(new Age(2012, 3));
		
		//얕은 복사
		Cat yo = navi;
		
		Cat yo2 = navi.copy();
		yo2.setName("yo");
		yo2.getAge().setYear(2013);
		yo2.getAge().setValue(2);
		
		
		System.out.println(navi.getName());
		System.out.println(yo2.getName());
		System.out.println(navi.getAge().getYear());
		System.out.println(yo2.getAge().getYear());
		System.out.println(navi.getAge().getValue());
		System.out.println(yo2.getAge().getValue());
	}

}
