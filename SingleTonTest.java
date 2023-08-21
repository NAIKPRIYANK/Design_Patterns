package DP.com;

public class SingleTonTest {

	public static void main(String[] args) {
		TestSingleTon obj1 = TestSingleTon.getInstance();
		TestSingleTon obj2 = TestSingleTon.getInstance();
		
		System.out.println("obj1 "+obj1.toString());
		System.out.println("obj2 "+obj2.toString());
	}

}
class TestSingleTon{
	static TestSingleTon obj= new TestSingleTon();
	private TestSingleTon() {
		
	}
	public static TestSingleTon getInstance() {
		return obj;
		
	}
	
}