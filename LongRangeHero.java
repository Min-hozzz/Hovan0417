package Chapter7;
/**
 * Զ�̹�����Ӣ��
 * @author Minho
 * TODO
 * @date 2020��4��19�� ����10:53:13
 * remark TODO
 */
public class LongRangeHero extends HeroDemo{
	private int attackDistance;
	
	public LongRangeHero(){
		super();
		
	}
	
	public LongRangeHero(long id,String name,int x,int y){
		super(id,name);
		setAttackDistance(attackDistance);
		setX(x);
		setY(y);
	}
	
	public int getAttackDistance(){
		return attackDistance;
	}
	
	public void setAttackDistance(int attackDistance){
		this.attackDistance = attackDistance;
	}

}
