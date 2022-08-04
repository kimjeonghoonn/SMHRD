package hhd;

import java.util.ArrayList;

// �߻�Ŭ���� : �̱����� Ŭ����
// 1. �߻�Ŭ������ ��ü������ �Ұ��� // Language lang = new Language(); x
// 2. �߻�Ŭ������ ��ӹ��� ����Ŭ������ ����Ŭ���� ������ �߻�޼ҵ带 ������ �������� ������

public abstract class Language {
	
	// �߻�޼ҵ� : �̱����� �޼ҵ�
	public abstract String getTitleMSG();
	public abstract String getInputMoneyMSG();
	public abstract String getChoiceMSG();
	public String getItemMSG(ArrayList<MenuDTO> menuList) {
		String msg = "";
		for (int i = 0; i< menuList.size(); i++) {
			msg += (i+1)+"."+menuList.get(i).getMenu_name();
			msg += "("+menuList.get(i).getMenu_price()+") ";
		}
		msg += ">>";
		return msg;
	};
	public abstract String getReturnCharge1();
	public abstract String getReturnCharge2(int money);

}