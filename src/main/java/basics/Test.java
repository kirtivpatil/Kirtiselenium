package basics;

public class Test {
	void show(){
		System.out.println("parent class method");
	}
	public static void main(String[] args) {

		Test ob = new Child();
		ob.show();
	}

}

class Child extends Test {
	void show(){
		System.out.println("child class method");
	}

}
