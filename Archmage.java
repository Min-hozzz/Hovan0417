package Chapter5.RPGdemo;

/**
 * 法师类英雄
 * 
 * @author Minho TODO
 * @date 2020年4月10日 下午3:49:44 remark TODO
 */
public class Archmage extends HeroW {
	public static int ID = 1; 
	
	private int magicalAttack;

	public Archmage() {
		setNickname("默认法师" + ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setMagicalAttack(99);
		ID++;
	}
	
	public Archmage(String nickname,int magicalAttack){
		this();
		setNickname(nickname);
	}
	
	public void biubiubiu(){
		System.out.println("法师" + getNickname() + "必杀技！");
	}
	
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickname());
		str.append("\t");
		str.append(getCurrentlife());
		str.append("\t");
		
		return str.toString();
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("我们法师从来不用腿！");
	}
	
	
	

	public int getMagicalAttack() {
		return magicalAttack;
	}

	public void setMagicalAttack(int magicalAttack) {
		this.magicalAttack = magicalAttack;
	}

}
