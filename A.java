
public class A  
{
	 int a;
	 int b;
	 int c;
	 char ch;
	 String s;
 A()
 {
	 this(5);
	
	 System.out.println("Default constructor");
	 
	 System.out.println("c="+c); 
 }
 A(int a)
 {
	 this(10,20,"Ritesh");
	 System.out.println("1-parameter constructor");
	 this.a=a;
	 System.out.println("a="+this.a);
 }
 A(int a,int b,String s)
 {
	 
	 this(1,2,'r');
	 System.out.println("2-parameter constructor");
	 this.a=a;
	 System.out.println("a="+this.a);
	 this.b=b;
	 System.out.println("b="+this.b);
	 this.s=s;
	 System.out.println("S="+this.s);
 }
 A(int a,int b,char ch)
 {
	 
	 System.out.println("3-parameter constructor");
	 this.a=a;
	 System.out.println("a="+this.a);
	 this.b=b;
	 System.out.println("b="+this.b);
	 this.ch=ch;
	 System.out.println("ch="+this.ch);
 }
 
	public static void main(String[] args) 
	{
		A a1=new A();
		/*Rectangle r1=new Rectangle();
		r1.area();
		r1.rotate();
		Triangle t1=new Triangle();
		t1.rotate();
		t1.area();
		Circle c1=new Circle();
		c1.rotate();
		c1.area();*/
		
		//a1.a=10;
		//a1.b=20;
		//a1.c=30;
		//a1.ch='T';*/
		

	}
}


