package date;

public class JavaSQLDate1 {

	public static void main(String[] args) {
		
		java.util.Date date1 = new java.util.Date();
		System.out.println("Today's date:"+date1);
		System.out.println("Today's date:"+date1.toString());
		long time = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(time);
		System.out.println(date);
		
		long time2 = System.currentTimeMillis();
		java.sql.Timestamp timestamp =new java.sql.Timestamp(time2);
		timestamp.setNanos(4343131);
		int nanos = timestamp.getNanos();
		System.out.println(nanos);
	}

}
