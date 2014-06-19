package com.balaji.classes;

public class InnerClassTest {
	
	private int x = 10;
	private static int y = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i = new InnerClassTest().new Inner();
		i.go();
		
		StaticInner s = new StaticInner();
		//Anonymous Inner Class
		test(new Runnable() {
			@Override
			public void run() {
				
			}
		});
		
	 

	}
	
	//Local Inner Class
	public static void test(Runnable t){
		class InnerTest {
			
		}
	}
	
	//Non-Static Inner class - Can either be Local or Anonymous.
	//Instantiated and used only after instantiating an Outer class.
	//Has access to outer class variables.
	class Inner {
		public void go(){
			System.out.println(y + "Test" + x);
		}
	}

	//Static Inner class.
	//Instantiated and used directly.
	//DOES NOT HAVE access to outer class variables, unless the Outer class is Instantiated within the Inner Class.
	private static class StaticInner {
		public void go(){
			System.out.println(y + "Test");
		}
	}
}
