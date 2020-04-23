package Chapter6;

/**
 * 单例模式
 * @author Minho
 * TODO
 * @date 2020年4月17日 上午2:06:53
 * remark TODO
 */
public class SingleDemo {
	/**
	 * 用来保存唯一的苯类的实例
	 */
	private static SingleDemo me = null;
	
	
	
	public int count = 0;
	private SingleDemo() {
		// TODO Auto-generated constructor stub
		count++;
	}
	
	/**
	 * 获得苯类的唯一一个实例 -- 单例模式的核心方法
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
