package AdapterPattern;

public class AdapterImpi implements Adapter {
	
	@Override
	public Float twiceOf(Float f) {
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		System.out.println("���� �Լ� ȣ�� ����");
		return (float)Math.halfTime(f.doubleValue());
	}

}
