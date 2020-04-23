package Chapter5.RPGdemo;
/**
 * սʿ��
 * @author Minho
 * TODO
 * @date 2020��4��9�� ����11:30:29
 * remark TODO
 */
public class Warrior extends HeroW {
	
	//��̬����
	public static int ID = 1; 
	
	
	
	//սʿ����������������
	private int pysicalAttach;
	
	public Warrior(){
		super();		//���๹���У�Ĭ�Ͼͻ���ø��๹��
		setNickname("Ĭ��սʿ" + ID);
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
		//��������obj��warriorʵ��
		if(!(obj instanceof Warrior)){
			return false;
		}
		Warrior newWarrior = (Warrior)obj;
		//�Ƚ�������
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
	
	
	@Override    //��д����
	public void move() {
		System.out.println("սʿ���ƶ�����");
	//	super.move();
	} 

	public int getPysicalAttach() {
		return pysicalAttach;
	}

	public void setPysicalAttach(int pysicalAttach) {
		this.pysicalAttach = pysicalAttach;
	}
	
	
}
