package Chapter6;
/**
 * �Խӿ�
 * @author Minho
 * TODO
 * @date 2020��4��21�� ����2:09:43
 * remark TODO
 */
public interface eat {
	public String name = "�ӿ��ж����������";
	
	default public void eating(){
		System.out.println("Eat�ӿڵ�Ĭ��ʵ��");
	}
}
