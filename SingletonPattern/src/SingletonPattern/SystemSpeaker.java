package SingletonPattern;

public class SystemSpeaker {
	static private SystemSpeaker instance;
	private int volume;
	private SystemSpeaker(){
		volume = 5;
	}
	
	public static SystemSpeaker getInstance(){
		if(instance ==null){
			//�ý��� ����Ŀ
			instance = new SystemSpeaker();
			System.out.println("���λ���");
		}else {
			System.out.println("�̹̻���");
		}
		return instance;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}