package TemplateMethodPattern;

public class DefaultGameConnectHelper extends absGameConnectHelper {

	@Override
	protected String doSecurity(String string) {
		System.out.println("��ȭ�� �˰����� �̿��� ���ڵ�");
		return string;
	}

	@Override
	protected boolean authenticaton(String is, String password) {
		System.out.println("���̵�/��ȣ Ȯ�� ����");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("���� Ȯ��");
		//�������� �����̸� ������ ���̸� �� �� �ִ�.
		//���̸� Ȯ���ϰ� �ð��� Ȯ���ϰ� ���̰� ������ �ƴϰ� 10�ð� �����ٸ�
		//������ ���� ������ �Ѵ�.
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("������ ���Ӵܰ�!");
		return null;
	}

}
