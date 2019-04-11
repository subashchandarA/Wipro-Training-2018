import java.util.Iterator;
import java.util.TreeSet;

public class TreeListDemo {

	public static void main(String[] args) {

		TreeSet<Student> tree = new TreeSet<Student>();
		Student s1=new Student(28,"Vijay");
		Student s2=new Student(21,"Subash");
		Student s3=new Student(32,"Ayya");
		
		tree.add(s1);
		tree.add(s2);
		tree.add(s3);
				
		Iterator it= tree.iterator();
		while(it.hasNext())
		{
			Student s= (Student)it.next();
			System.out.println(s.name+"  " +s.rno);
		}
	
		System.out.println(tree);
	}

}
