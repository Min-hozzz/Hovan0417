package Chapter7;

/**
 * 英雄类
 * 
 * @author Minho TODO
 * @date 2020年4月17日 上午11:48:59 remark TODO
 */
public abstract class HeroDemo {
	private long id;
	private String name;
	private int level;
	private int maxHp;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	public HeroDemo(){
		setMaxHp(100);
		setHp(100);
	}
	
	public HeroDemo(long id,String name){
		this();
		setId(id);
		setName(name);
		
	}
	
	/**
	 * 使用模板模式实现的对战方法
	 * 规定默认情况下对战的流程
	 * @param hero
	 */
	public void PK(HeroDemo hero){
		//1.就算距离判断是否能攻击对方
		if(canFightByDistance(hero) && hp > 0 && hero.getHp()>0){
			fight(hero);
		}else{
			System.out.println("攻击距离不够或攻击被闪躲！");
		}
		//2.如果可以攻击，调用攻击
		//3.控制台打印效果
		System.out.println("两位英雄的当前状态");
		System.out.println("昵称\tHP\tX坐标\tY坐标");
		System.out.println(name + "\t" + hp + "\t" + x + "\t" + y );
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getHp(),hero.getX(),hero.getY());
		
		System.out.println();
		if(hero.getHp() <= 0){
			System.out.println("敌方已被击杀！");}
//		}else{
//			while(true){
//				fight(hero);
//			}
//		}
	}
	
	/**
	 * 判断当前英雄是否能攻击传入的英雄对象
	 * @param hero
	 * @return 是否能攻击
	 */
	public boolean canFightByDistance(HeroDemo hero){
		return false;
		
		
	}
	
	/**
	 * 攻击传入的英雄对象，默认根据随机生成的攻击力减hp值
	 * @param hero
	 */
	public void fight(HeroDemo hero){
		
	}
	
	protected double getDistance(int x1, int y1,int x2,int y2){
		return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
	}
	



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level < 0 || level > 100){
			this.level = 1;
		}else{
			this.level = level;
		}
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getHp() {
		return hp;
		}

	public void setHp(int hp) {
		if(hp<=0){
			this.hp = 0;
		}
		else{
			this.hp = hp;
		}
		
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
