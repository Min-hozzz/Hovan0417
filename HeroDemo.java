package Chapter7;

/**
 * Ӣ����
 * 
 * @author Minho TODO
 * @date 2020��4��17�� ����11:48:59 remark TODO
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
	 * ʹ��ģ��ģʽʵ�ֵĶ�ս����
	 * �涨Ĭ������¶�ս������
	 * @param hero
	 */
	public void PK(HeroDemo hero){
		//1.��������ж��Ƿ��ܹ����Է�
		if(canFightByDistance(hero) && hp > 0 && hero.getHp()>0){
			fight(hero);
		}else{
			System.out.println("�������벻���򹥻������㣡");
		}
		//2.������Թ��������ù���
		//3.����̨��ӡЧ��
		System.out.println("��λӢ�۵ĵ�ǰ״̬");
		System.out.println("�ǳ�\tHP\tX����\tY����");
		System.out.println(name + "\t" + hp + "\t" + x + "\t" + y );
		System.out.printf("%s\t%d\t%d\t%d",
				hero.getName(),hero.getHp(),hero.getX(),hero.getY());
		
		System.out.println();
		if(hero.getHp() <= 0){
			System.out.println("�з��ѱ���ɱ��");}
//		}else{
//			while(true){
//				fight(hero);
//			}
//		}
	}
	
	/**
	 * �жϵ�ǰӢ���Ƿ��ܹ��������Ӣ�۶���
	 * @param hero
	 * @return �Ƿ��ܹ���
	 */
	public boolean canFightByDistance(HeroDemo hero){
		return false;
		
		
	}
	
	/**
	 * ���������Ӣ�۶���Ĭ�ϸ���������ɵĹ�������hpֵ
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
