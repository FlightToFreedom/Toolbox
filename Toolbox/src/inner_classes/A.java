package inner_classes;


public class A {

	public class B{

	}

	static class C{

	}

	public static void main(String[] args){
		//XXX a non-static inner class can only exist within the outer class, therefore we first need an object of
		//the outer class, only then we can instantiate the inner class.
		A a=new A();
		A.B b=a.new B();
		//XXX C class is static, is not part of 'A' it can be  instantiated without needing an enclosing 'A' object
		C c=new C();
		System.out.println(b+""+c);
	}
}
