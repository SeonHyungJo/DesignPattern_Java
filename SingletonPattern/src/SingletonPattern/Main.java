package SingletonPattern;

//�ϳ��� �����ؾ��� ��ü�� ���� ����
/*
 * �������� �ý��ۿ��� ����Ŀ�� ���� �� �� �ִ� Ŭ������ ����� �ּ���
 * �ν��Ͻ��� ȣ�� �� �� �α׸� ����ִ� �ҽ��� �߰�
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
