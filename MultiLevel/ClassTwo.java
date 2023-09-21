package MultiLevel;

public class ClassTwo extends ClassOne {

	public static void main(String[] args) {
		ClassTwo ct=new ClassTwo();
		ct.cycle();
		ct.scooty();
		ct.car();
		ct.bike();
	

	}
	public void cycle() {
		System.out.println("cycle code executed in child");
	}
	public void scooty() {
		System.out.println("scooty code executed in child");
		
	}
	
	

	}


