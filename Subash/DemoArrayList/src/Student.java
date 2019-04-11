
public class Student implements Comparable{

	int rno;
	String name;
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Student stud=(Student)o;
		if(this.rno <stud.rno)
			return -1;
		else
			if(this.rno==stud.rno)
				return 0;
			else
				return 1;
	}
	
	
}


