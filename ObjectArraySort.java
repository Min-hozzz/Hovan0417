package Chapter5.RPGdemo;

public class ObjectArraySort{
	
	public static void sort(HeroW[] heroArray){
		HeroW temp = null;
		for (int i = 0; i < heroArray.length; i++) {
			for (int j = 0; j < heroArray.length-i-1; j++) {
				if(heroArray[j].CompareToByName(heroArray[j+1]) <0){
					temp = heroArray[j];
					heroArray[j] = heroArray[j+1];
					heroArray[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Warrior 战士1 = new Warrior();
		Warrior 战士2 = new Warrior();
		Warrior 战士3 = new Warrior();
		Warrior 战士4 = new Warrior();
		Warrior 战士5 = new Warrior();
		
		Archmage 法师1 = new Archmage();
		Archmage 法师2 = new Archmage();
		Archmage 法师3 = new Archmage();
		Archmage 法师4 = new Archmage();
		Archmage 法师5 = new Archmage();
		
		HeroW[] heroArray = {
			战士1,战士2,战士3,战士4,战士5,
			法师1,法师2,法师3,法师4,法师5
		};
		
		System.out.println("排序前：");
		System.out.println("级别\t昵称\t\t当前生命值");
		for(HeroW hero : heroArray ){
			System.out.println(hero);
		}
		
		
		sort(heroArray);
		System.out.println("排序后：");
		System.out.println("级别\t昵称\t\t当前生命值");
		for(HeroW hero : heroArray ){
			System.out.println(hero);
		}
	}
}
