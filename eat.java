package Chapter6;
/**
 * 吃接口
 * @author Minho
 * TODO
 * @date 2020年4月21日 下午2:09:43
 * remark TODO
 */
public interface eat {
	public String name = "接口中定义的数据域";
	
	default public void eating(){
		System.out.println("Eat接口的默认实现");
	}
}
