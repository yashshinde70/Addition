public class Addition{
	int a,b;
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		Addition a=new Addition(5, 8);
		System.out.println(a.a+a.b);
	}
}
