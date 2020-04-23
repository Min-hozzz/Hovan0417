package Chapter5.RPGdemo;

/**
 * ��ʦ��Ӣ��
 * 
 * @author Minho TODO
 * @date 2020��4��10�� ����3:49:44 remark TODO
 */
public class Archmage extends HeroW {
	public static int ID = 1; 
	
	private int magicalAttack;

	public Archmage() {
		setNickname("Ĭ�Ϸ�ʦ" + ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setMagicalAttack(99);
		ID++;
	}
	
	public Archmage(String nickname,int magicalAttack){
		this();
		setNickname(nickname);
	}
	
	public void biubiubiu(){
		System.out.println("��ʦ" + getNickname() + "��ɱ����");
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickname());
		str.append("\t");
		str.append(getCurrentlife());
		str.append("\t");
		
		return str.toString();
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("���Ƿ�ʦ���������ȣ�");
	}
	
	
	

	public int getMagicalAttack() {
		return magicalAttack;
	}

	public void setMagicalAttack(int magicalAttack) {
		this.magicalAttack = magicalAttack;
	}

}
