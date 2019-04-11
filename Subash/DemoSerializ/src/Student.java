import java.io.Serializable;

public class Student implements Serializable {
          int id;
          String name;
          transient int mark;
         static int passkey=101;
          
		public Student  (String name, int mark) {
			super();
			this.id = passkey;
			this.name = name;
			this.mark = mark;
			passkey++;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMark() {
			return mark;
		}
		public void setMark(int mark) {
			this.mark = mark;
		}
		public int getPasskey() {
			// TODO Auto-generated method stub
			return passkey;
		}
          
          
	
}
