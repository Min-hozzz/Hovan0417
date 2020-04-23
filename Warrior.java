package Chapter7;

import chapter1.Hero;

/**
 * 战士类
 * @author Minho
 * TODO
 * @date 2020年4月19日 下午10:29:30
 * remark TODO
 */

public class Warrior extends HeroDemo{
	public Warrior(){
		super();
		setName("默认英雄");
		
	}
	
	public Warrior(long id ,String name,int x ,int y){
		super(id,name);
		setX(x);
		setY(y);
	}
	
	@Override
	public boolean canFightByDistance(HeroDemo hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		//假设战士的攻击距离固定为100
		return distance <= 100;
		
	}
	
	@Override
	public void fight(HeroDemo hero) {
		//1.生成随机的攻击力
		//2.剪掉传英雄对象的hp
		int attack = ((int)(Math.random()*1000)) % 51 + 20;//20-70之间
		setAttack(attack);
	//	System.out.println(getAttack());
		hero.setHp(hero.getHp() - attack);
		
		
	}
}
