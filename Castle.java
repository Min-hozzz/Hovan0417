package Chapter7.battlegame;

/**
 * �Ǳ��������� - ��Ӣ����
 * 
 * @author Minho TODO
 * @date 2020��4��20�� ����11:04:30 remark TODO
 */
public class Castle implements Assailable {
	private String name;
	private int x;
	private int y;
	private int hp;
	private int maxHp;
	private int attackDistance;
	private int attack;

	public Castle(String name,int x,int y ,int attackDistance){
		setName(name);
		setX(x);
		setY(y);
		setAttackDistance(attackDistance);
		setmaxHp(100);
		setHp(100);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getmaxHp(){
		return maxHp;
	}
	
	public void setmaxHp(int maxHp){
		this.maxHp = maxHp;
	}
	
	
	public int getAttackDistance() {
		return attackDistance;
	}

	public void setAttackDistance(int attackDistance) {
		this.attackDistance = attackDistance;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	@Override
	public boolean canFightByDistance(Assailable assa) {
		// 1.��������һ���ɹ�������֮��ľ���
		//2.�����������Ϸ����ͽ��й���
		
		return false;
	}

	@Override
	public void fight(Assailable assa) {
		//����Ǳ��Ĺ������̶���
		int count = 0;
		int attack = 10;
		assa.setHp(assa.getHp() - attack);
		
//		while(canFightByDistance(assa)){
//			fight(assa);
//			count++;
//			attack = attack + count*5;
//			assa.setHp(assa.getHp() - attack);
//			System.out.println("���������" + attack+ "���˺�");
//		}
		

	}

}
