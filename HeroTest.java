package Chapter5.RPGdemo;

public class HeroTest {
	public static void main(String[] args) {
		
		
//		Warrior Nakelulu = new Warrior("Nakelulu",1500);
//		Nakelulu.setLevel(500);
//		
//		Warrior Nakelulu2 = new Warrior("Nakelulu",1500);
//		Nakelulu2.setLevel(980);
//		
//		System.out.println(Nakelulu.Compareto(Nakelulu2));
//		
//		System.out.println(Nakelulu == Nakelulu2);
//		System.out.println(Nakelulu.equals(Nakelulu2));
//		
//		System.out.println(Nakelulu);
		Warrior 韩信 = new Warrior();
	//	HeroW 韩信;
	//	韩信 = new Warrior();
		韩信.move();
//		
//		//
		
//		Warrior Hunter = new Warrior("Hunter",501);
//		Hunter.move();   //调用子类实现的重写move
//		System.out.println(Hunter.getNickname());
		
		Archmage Miredi = new Archmage("Miredi",5000);
		Miredi.setLevel(500);
		Miredi.biubiubiu();
		
		System.out.println(Miredi);
		
		Miredi.move();
		 
	}
}
