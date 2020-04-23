package Chapter5.RPGdemo;

import chapter1.Hero;

/**
 *游戏英雄的基础类
 * @author Minho
 * TODO
 * @date 2020年4月9日 上午11:30:09
 * remark TODO
 */


public class HeroW {
	private String nickname;
	private int level;
	private int maxlife;
	private int currentlife;
	
	public HeroW() {
		//
		System.out.println("父类默认构造");
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
	 * 比较当前英雄对象和传入对象的大小相等
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
	 * 父类方法，英雄移动
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
