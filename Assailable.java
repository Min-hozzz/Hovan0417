package Chapter7.battlegame;
/**
 * 可攻击接口，实现本接口相当于具备实施攻击对象的基本特征
 * @author Minho
 * TODO
 * @date 2020年4月20日 下午9:17:40
 * remark TODO
 */
public interface Assailable {
	String getName();     //
	int getX();
	void setX(int x);
	int getY();
	void setY(int y);
	int getHp();
	void setHp(int hp);

	/**
	 * 根据距离判断，是否能够成功攻击另一个具备攻击能力的对象
	 * @param assa
	 * @return
	 */
	boolean canFightByDistance(Assailable assa);
	
	/**
	 * 攻击另一个具备攻击能力的对象（也可以理解成军事单位）
	 * @param assaa
	 */
	void fight(Assailable assa);
	
}
