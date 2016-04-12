package HelloWorld;

public class HelloWorld {
	
	public static void main(String[] args) {
		new C("HelloWorld");
	}
}

class A{
	A(String a){
		System.out.println("a: " +a);
	}
}
class B{
	B(String b){
		System.out.println("b: " + b);
	}
}

class C extends A {
	C(String c){
	super(c);
		 new B(c);
	}
}