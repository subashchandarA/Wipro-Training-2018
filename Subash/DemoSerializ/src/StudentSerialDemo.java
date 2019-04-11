import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud=new Student("subash",80);
		
		try {
			 FileOutputStream fo = new FileOutputStream("D:\\Subash\\object.txt");
		     ObjectOutputStream oos= new ObjectOutputStream(fo);
	         oos.writeObject(stud);

		System.out.println(" congrads ");
		} 
		
		  catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
