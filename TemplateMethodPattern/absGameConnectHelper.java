package TemplateMethodPattern;

public abstract class absGameConnectHelper {
	
	protected abstract String doSecurity(String string);
	
	protected abstract boolean authenticaton(String is, String password);
	
	protected abstract int authorization(String userName);
	
	protected abstract String connection(String str);
	
	
	//템플릿 메소드
	public String requestConnection(String encoedInfo){
		//보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(encoedInfo);
		//반환된 것을 가지고  아이디, 암호를 할당한다.
		String id = "aaa";
		String password = "aaa";
		
		if (!authenticaton(id, password)) {
			throw new Error("아이디 암호 불일치");
		}
		
		
		String  userName = "userName";
		int i = authorization(userName);
		
		switch (i) {
		case -1:
			throw new Error("셧다운");
		case 0://게임 매니져
			break;
		case 1://유료회원
			
			break;
		case 2://무료회원
	
			break;
		case 3://권한 없음
			
			break;
			
		default://기타 상황
			break;
		}
		
		return connection(decodedInfo);
	}
}
