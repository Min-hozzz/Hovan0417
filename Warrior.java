package Chapter5.RPGdemo;
/**
 * 战士类
 * @author Minho
 * TODO
 * @date 2020年4月9日 上午11:30:29
 * remark TODO
 */
public class Warrior extends HeroW {
	
	//静态属性
	public static int ID = 1; 
	
	
	
	//战士特有属性物理攻击力
	private int pysicalAttach;
	
	public Warrior(){
		super();		//子类构造中，默认就会调用父类构造
		setNickname("默认战士" + ID);
		setLevel(1);
		setMaxlife(100);
		setCurrentlife(100);
		setPysicalAttach(99);
		ID++;
	}
	
	public Warrior(String nickname,int pysicalAttach){
		this();
		setNickname(nickname);
		setPysicalAttach(pysicalAttach);
	}
	
	@Override
	public boolean equals(Object obj) {
		//如果传入的obj是warrior实例
		if(!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		//比较俩属性
		if(getNickname().equals(newWarrior.getNickname()) && getPysicalAttach() == newWarrior.getPysicalAttach()){
			return true;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickname());
		str.append("\t");
		str.append(getCurrentlife());
		str.append("\t");
		
		return str.toString();
	}
	
	
	@Override    //重写方法
	public void move() {
		System.out.println("战士的移动靠腿");
	//	super.move();
	} 

	public int getPysicalAttach() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
	
}
