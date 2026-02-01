
class Parent {
	int a = 10;
	void m1() {
		System.out.println("Parent m1()");
	}
}

class Child extends Parent{
	int b = 20;
	
	@Override
	void m1() {
		System.out.println("Child m1()");
	}
	
	void m2() {
		System.out.println("Child m2()");
	}
	
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		Parent p = new Child();
		
		p.m1();
		System.out.println(p.a);
		
	}
}
