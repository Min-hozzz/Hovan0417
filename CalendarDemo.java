package Chapter6;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 演示日历类的常用方法
 * 同时日历类也是单例模式
 * @author Minho
 * TODO
 * @date 2020年4月17日 上午2:31:48
 * remark TODO
 */

public class CalendarDemo {
	
	public static void main(String[] args) throws ParseException {
		//Calendar是一个抽象类，一般由子类GregorianCalendar实现
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass());
		
		//使用日历打印当前的时间
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		String strTime = String.format("%d-%d-%d %d:%d:%d", 
				year,month,day,hour,minute,second);
		
		System.out.println("当前时间："+strTime);
	//	System.out.println(year);
		
	  //为日历对象设定时间
		cal.set(2020, 4, 16,8,15,27);
		Date date = cal.getTime();
		System.out.println(date.toLocaleString());
		
		SimpleDateFormat format = new SimpleDateFormat("yyy-MM-dd HH:mm:ss:SSS");
		String strDate =format.format(date);
		System.out.println(strDate);
		//将字符串转换成Date类型
		
		Date newDate = format.parse("2020-12-30 24:59:59:999");
		System.out.println(newDate.toLocaleString());
		
		
		GregorianCalendar cal2 = new GregorianCalendar(2020,3,15);
		long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis());
		
		int diffDays =(int)(diff / 1000/ 60 / 60 / 24);
		
		System.out.println("相差" + diffDays + "天");
		
		cal.add(Calendar.YEAR, 5);
		System.out.println(cal.get(Calendar.YEAR)); 

	}
		
		

}
