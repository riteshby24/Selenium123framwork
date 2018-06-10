
public class HelloWorld {

	public static void main(String[] args) {
		int space=20;
		int star=1;
		int a=1;
		for(int i=1;i<=4;i++) {
			
			//a++;   
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=star;k++) {
				
				System.out.print(a);
				a++;
				
			}
			space--;
			star+=2;
			System.out.println("");
		}
		
    
	}

}


