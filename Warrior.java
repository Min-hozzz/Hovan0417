package Chapter7;

import chapter1.Hero;

/**
 * սʿ��
 * @author Minho
 * TODO
 * @date 2020��4��19�� ����10:29:30
 * remark TODO
 */

public class Warrior extends HeroDemo{
	public Warrior(){
		super();
		setName("Ĭ��Ӣ��");
		
	}
	
	public Warrior(long id ,String name,int x ,int y){
		super(id,name);
		setX(x);
		setY(y);
	}
	
	@Override
	public boolean canFightByDistance(HeroDemo hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		//����սʿ�Ĺ�������̶�Ϊ100
		return distance <= 100;
		
	}
	
	@Override
	public void fight(HeroDemo hero) {
		//1.��������Ĺ�����
		//2.������Ӣ�۶����hp
		int attack = ((int)(Math.random()*1000)) % 51 + 20;//20-70֮��
		setAttack(attack);
	//	System.out.println(getAttack());
		hero.setHp(hero.getHp() - attack);
		
		
	}
}
