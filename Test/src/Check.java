
public class Check {
	String s;
	
	void test() {
		System.out.println("This is called using object of forName()");
	}
	public static void main(String[] args) throws ClassNotFoundException {
		
//		System.out.println(s);
		
//		Check c= new Check();
//		Class<? extends Check> class1 = c.getClass();
		Class<?> forName = Class.forName("Check");
		
	
	}

}
