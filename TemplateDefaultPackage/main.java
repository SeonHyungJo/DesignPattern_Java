package TemplateDefaultPackage;

import TemplateMethodPattern.*;

/*
 * �˰����� ������ �޼ҵ忡 �����ϰ� ���� Ŭ�������� �˰��� ������ ������� �˰����� �������ϴ� ����
 * ----------------------------------
 * �����Ϸ��� �˰����� ������ ���μ����� �ִ�
 * �����Ϸ��� �˰����� ���氡�ɼ���  �ִ�.
 * ----------------------------------
 * �˰����� ���� �ܰ�� ������
 * ������ �˰����� �ܰ踦 �޼ҵ�� �����Ѵ�.
 * �˰����� ������ ���ø� �޼ҵ带 �����
 * ���� Ŭ�������� ������ �޼ҵ带 �����Ѵ�.
 * 
 */
public class main {

	public static void main(String[] args) {
		absGameConnectHelper helper = new DefaultGameConnectHelper();
		
		helper.requestConnection("���̵� ��ȣ �� ���� ����");
		

	}

}
