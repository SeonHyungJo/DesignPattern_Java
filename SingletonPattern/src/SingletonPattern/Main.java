package SingletonPattern;

//하나만 생성해야할 객체를 위한 패턴
/*
 * 개발중인 시스템에서 스피커에 접근 할 수 있는 클래스를 만들어 주세요
 * 인스턴스를 호출 할 때 로그를 찍어주는 소스를 추가
 */ 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemSpeaker speaker1 = SystemSpeaker.getInstance();
		SystemSpeaker speaker2 = SystemSpeaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker2.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
	}

}
