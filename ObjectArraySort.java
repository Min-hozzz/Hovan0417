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
		Warrior սʿ1 = new Warrior();
		Warrior սʿ2 = new Warrior();
		Warrior սʿ3 = new Warrior();
		Warrior սʿ4 = new Warrior();
		Warrior սʿ5 = new Warrior();
		
		Archmage ��ʦ1 = new Archmage();
		Archmage ��ʦ2 = new Archmage();
		Archmage ��ʦ3 = new Archmage();
		Archmage ��ʦ4 = new Archmage();
		Archmage ��ʦ5 = new Archmage();
		
		HeroW[] heroArray = {
			սʿ1,սʿ2,սʿ3,սʿ4,սʿ5,
			��ʦ1,��ʦ2,��ʦ3,��ʦ4,��ʦ5
		};
		
		System.out.println("����ǰ��");
		System.out.println("����\t�ǳ�\t\t��ǰ����ֵ");
		for(HeroW hero : heroArray ){
			System.out.println(hero);
		}
		
		
		sort(heroArray);
		System.out.println("�����");
		System.out.println("����\t�ǳ�\t\t��ǰ����ֵ");
		for(HeroW hero : heroArray ){
			System.out.println(hero);
		}
	}
}
