
public class rectangle extends figure{

	int l,b;
	
	public rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}
	

	@Override
	int area() {
		
		// TODO Auto-generated method stub
		return (int)(l*b*3.14);
	}

}
