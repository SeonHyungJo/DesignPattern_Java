package TemplateMethodPattern;

public abstract class absGameConnectHelper {
	
	protected abstract String doSecurity(String string);
	
	protected abstract boolean authenticaton(String is, String password);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String str);
	
	
	//���ø� �޼ҵ�
	public String requestConnection(String encoedInfo){
		//���� �۾� -> ��ȣȭ �� ���ڿ��� ��ȣȭ
		String decodedInfo = doSecurity(encoedInfo);
		//��ȯ�� ���� ������  ���̵�, ��ȣ�� �Ҵ��Ѵ�.
		String id = "aaa";
		String password = "aaa";
		
		if (!authenticaton(id, password)) {
			throw new Error("���̵� ��ȣ ����ġ");
		}
		
		
		String  userName = "userName";
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			throw new Error("�˴ٿ�");
		case 0://���� �Ŵ���
			break;
		case 1://����ȸ��
			
			break;
		case 2://����ȸ��
	
			break;
		case 3://���� ����
			
			break;
			
		default://��Ÿ ��Ȳ
			break;
		}
		
		return connection(decodedInfo);
	}
}
