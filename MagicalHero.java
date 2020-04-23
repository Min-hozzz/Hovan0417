package Chapter7;

/**
 * ��ʦ��
 * 
 * @author Minho TODO
 * @date 2020��4��19�� ����11:01:02 remark TODO
 */
public class MagicalHero extends LongRangeHero {
	private int MagicalAttack = (int)(Math.random()*350+20);

	public MagicalHero() {
		super();
		setName("Ĭ�Ϸ�ʦ");
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
		System.out.println("��ͨ�������" + attack + "�˺�");
		
		MagicFight(hero);

	}

	/**
	 * ��ʦħ������
	 * @param hero
	 */
	public void MagicFight(HeroDemo hero) {
		setMagicalAttack(MagicalAttack);
		hero.setHp(hero.getHp() - getMagicalAttack());
		System.out.println("���" + MagicalAttack + "��ħ���˺�");
	}

	public int getMagicalAttack() {
		return MagicalAttack;
	}

	public void setMagicalAttack(int magicalAttack) {
		MagicalAttack = magicalAttack;
	}
}
