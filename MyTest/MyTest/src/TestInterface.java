
public interface TestInterface {

	public void m1();
	
	public void m2();
	
}

 abstract class AbstractClass implements TestInterface{
	 
	 public  void m3() {
		 
	 }
	
}
 
 class ConcreteClass extends AbstractClass{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}


	 
 }
