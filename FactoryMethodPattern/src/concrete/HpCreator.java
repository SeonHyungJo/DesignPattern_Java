package concrete;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator{

	@Override
	protected void requestItemInfo() {
		System.out.println("데이터베이스에서 체력회복물약 정보를 가져왔습니다.");		

		
	}

	@Override
	protected void createItemLog() {
		System.out.println("체력회복물약을 새로 생성했습니다." + new Date());		
	}

	@Override
	protected Item createItem() {
		return new HpPotion();
	}
	
}
