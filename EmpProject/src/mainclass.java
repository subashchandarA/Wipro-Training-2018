import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class mainclass {
public static void main(String[] args) throws ParseException {
	Date d1 = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
	Date d2 = sf.parse("22-03-2018");
	System.out.println("d1 : "+d1);
	System.out.println("d2 : "+d2);
	System.out.println(d1.after(d2));
	System.out.println(d1.before(d2));
	System.out.println(d1.compareTo(d2));
}
}
