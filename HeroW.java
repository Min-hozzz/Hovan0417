package Chapter5.RPGdemo;

import chapter1.Hero;

/**
 *��ϷӢ�۵Ļ�����
 * @author Minho
 * TODO
 * @date 2020��4��9�� ����11:30:09
 * remark TODO
 */


public class HeroW {
	private String nickname;
	private int level;
	private int maxlife;
	private int currentlife;
	
	public HeroW() {
		//
		System.out.println("����Ĭ�Ϲ���");
	//	super();
		// TODO Auto-generated constructor stub
	}
	

	public HeroW(String nickname, int level, int maxlife, int currentlife) {
		super();
		this.nickname = nickname;
		this.level = level;
		this.maxlife = maxlife;
		this.currentlife = currentlife;
	}
	
	public int CompareToByName(HeroW hero){
		return getNickname().compareTo(hero.getNickname());
				
	}
	
	/**
	 * �Ƚϵ�ǰӢ�۶���ʹ������Ĵ�С���
	 * @param hero
	 * @return
	 */
	public int compareTo(HeroW hero){
		if(this.level > hero.getLevel())
			return 1;
		else if(this.level == hero.getLevel())
			return 0;
		else
			return -1;
	}
	
	
	/**
	 * ���෽����Ӣ���ƶ�
	 */
	
	public void move(){
		System.out.println(".");
	}
	

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxlife() {
		return maxlife;
	}

	public void setMaxlife(int maxlife) {
		this.maxlife = maxlife;
	}

	public int getCurrentlife() {
		return currentlife;
	}

	public void setCurrentlife(int currentlife) {
		this.currentlife = currentlife;
	}

}
