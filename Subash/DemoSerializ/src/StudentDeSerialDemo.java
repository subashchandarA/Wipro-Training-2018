import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StudentDeSerialDemo {

	public static void main(String[] args) {
		
		
		FileInputStream fs;
		try {
			fs = new FileInputStream("D:\\Subash\\object.txt");
			ObjectInputStream ois = new ObjectInputStream(fs);
		    Student stud =(Student)ois.readObject();
			System.out.println(stud.getId());
			System.out.println(stud.getName());
			System.out.println(stud.getMark());
		    System.out.println(stud.getPasskey());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
