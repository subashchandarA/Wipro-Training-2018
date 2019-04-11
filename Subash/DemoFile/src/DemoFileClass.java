import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFileClass {

	public static void main(String[] args) {
		try {
			
			FileReader fr=new FileReader("D:\\Subash\\file1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String str;
				
			while( (str =br.readLine())!= null) {
					//char ch = (char) i;
					System.out.println(str);
				    }	 
			
		     br.close();
		     fr.close();
		
		} 
		      catch (Exception e) {
				
				e.printStackTrace();
			    }
			
		      
			
	}
}
