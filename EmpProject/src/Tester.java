import java.util.Date;

import com.wipro.bean.Employee;
import com.wipro.dao.EmployeeDAO;


public class Tester {
public static void main(String[] args) {
	EmployeeDAO dao = new EmployeeDAO();
	Employee e = new Employee();
	e.setEmpno(1010);
	e.setEname("RAM");
	e.setHiredate(new Date());
	String res=dao.insertEmployee(e);
	System.out.println(res);
}
}
