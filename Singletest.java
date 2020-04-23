package Chapter6;

public class Singletest {
	public static void main(String[] args) {
		SingleDemo s1 = SingleDemo.getInstance();
		System.out.println(s1.count);
		s1.count++;
		
		SingleDemo s2 = SingleDemo.getInstance();
		System.out.println(s2.count);
		
		System.out.println(s1 == s2);
			
	}
	
}
