
public class finalExample {
	
	final static int i=10;

	public static void main(String[] args) {
		finalExample f1=new finalExample();
		System.out.println(f1.i);
		//i=100;  //CTE can not reinitialized variable because it is final method.
	}

}
