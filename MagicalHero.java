package Chapter7;

/**
 * 法师类
 * 
 * @author Minho TODO
 * @date 2020年4月19日 下午11:01:02 remark TODO
 */
public class MagicalHero extends LongRangeHero {
	private int MagicalAttack = (int)(Math.random()*350+20);

	public MagicalHero() {
		super();
		setName("默认法师");
		setAttackDistance(550);

	}

	public MagicalHero(long id, String name, int x, int y) {
		super(id, name, x, y);
		setX(x);
		setY(y);
		setAttackDistance(550);

	}

	@Override
	public boolean canFightByDistance(HeroDemo hero) {
		double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
		return distance <= getAttackDistance();
	}

	@Override
	public void fight(HeroDemo hero) {
		int attack = (int) ((Math.random() * 1000) % 41 + 10);
		setAttack(attack);
		hero.setHp(hero.getHp() - attack);
		System.out.println("普通攻击造成" + attack + "伤害");
		
		MagicFight(hero);

	}

	/**
	 * 法师魔法攻击
	 * @param hero
	 */
	public void MagicFight(HeroDemo hero) {
		setMagicalAttack(MagicalAttack);
		hero.setHp(hero.getHp() - getMagicalAttack());
		System.out.println("造成" + MagicalAttack + "点魔法伤害");
	}

	public int getMagicalAttack() {
		return MagicalAttack;
	}

	public void setMagicalAttack(int magicalAttack) {
		MagicalAttack = magicalAttack;
	}
}
