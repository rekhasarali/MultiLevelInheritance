package MultiLevel;

public class ClassOne {

	public static void main(String[] args) {
		ClassOne co=new ClassOne();
		co.car();
		co.bike();
	

	}
	public void car() {
		System.out.println("car code executed in parent");
	}
	public void bike() {
		System.out.println("bike code executed in parent");
		
	}
	
	
	

}
