package Chapter6;

/**
 * ����ģʽ
 * @author Minho
 * TODO
 * @date 2020��4��17�� ����2:06:53
 * remark TODO
 */
public class SingleDemo {
	/**
	 * ��������Ψһ�ı����ʵ��
	 */
	private static SingleDemo me = null;
	
	
	
	public int count = 0;
	private SingleDemo() {
		// TODO Auto-generated constructor stub
		count++;
	}
	
	/**
	 * ��ñ����Ψһһ��ʵ�� -- ����ģʽ�ĺ��ķ���
	 * @param args
	 */
	
	public static SingleDemo getInstance(){
		if(null == me) 
			me = new SingleDemo();
		return me;
		
		
	}
	
	public static void main(String[] args) {
		
//		SingleDemo single1 = new SingleDemo();
//		System.out.println(single1.count);
//		
//		SingleDemo single2 = new SingleDemo();
//		System.out.println(single2.count);
//		
//		
//		SingleDemo single3 = new SingleDemo();
//		System.out.println(single3.count);
//		
//		SingleDemo single4 = new SingleDemo();
//		System.out.println(single4.count);
		
		
	}
}
