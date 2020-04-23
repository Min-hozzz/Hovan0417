package Chapter7.battlegame;
/**
 * �ɹ����ӿڣ�ʵ�ֱ��ӿ��൱�ھ߱�ʵʩ��������Ļ�������
 * @author Minho
 * TODO
 * @date 2020��4��20�� ����9:17:40
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
	 * ���ݾ����жϣ��Ƿ��ܹ��ɹ�������һ���߱����������Ķ���
	 * @param assa
	 * @return
	 */
	boolean canFightByDistance(Assailable assa);
	
	/**
	 * ������һ���߱����������Ķ���Ҳ�������ɾ��µ�λ��
	 * @param assaa
	 */
	void fight(Assailable assa);
	
}
