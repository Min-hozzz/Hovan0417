package Chapter7;

public class HeroTest {
	public static void main(String[] args) {
		//两个战士之间的对战
		HeroDemo hero1 = new Warrior(1,"吕布",0,0);
		HeroDemo hero2 = new Warrior(2,"白起",50,25);
		hero1.PK(hero2);
		System.out.println();
//		System.out.println((int)(Math.random()*1000)%41 + 10);
//		int attcak = (int)((Math.random()*1000)%41 + 10);
		
		MagicalHero hero3 = new MagicalHero(4, "鲜红女巫", 30, 80);
		Warrior hero4 = new Warrior(5,"灭霸",65,75);
		hero3.PK(hero4);
				
	}
}
