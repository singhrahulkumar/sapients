class Parent{
	public Object m1() {
		return new Object();
	}
}

class Child extends Parent{

	public String m1() {
		return "A";
	}
}


public class Test {

	public static void main(String[] args) {
		Parent p = new Parent();
		Object r = p.m1();
		System.out.println(r);
	}



}
