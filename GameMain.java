package Chapter7.battlegame;

public class GameMain {
	public static void main(String[] args) {
		Hero hero1 = new Warrior(1,"²Ü²Ù",11,11);
		Castle c1 = new Castle("ÎÖ¶û·òË¹±¤",120,120,550);
		System.out.println(hero1.getHp());
		hero1.Battle(c1);
		
		c1.fight(hero1);
		
		System.out.println(hero1.getHp());
	}
}
