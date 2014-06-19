package com.balaji.designpatterns;

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		DecoratorPattern d = new HoneyDecorator(new NutsDecorator(new SimpleDecorator()));
		d.decorate();
		
		DecoratorPattern d1 = new NutsDecorator((new HoneyDecorator(new SimpleDecorator())));
		d1.decorate();
	}

	private static class SimpleDecorator implements DecoratorPattern {

		@Override
		public void decorate() {
			System.out.println("Simple Decorator");
		}
	}
	
	private static abstract class AddedDecorator implements DecoratorPattern {
		
		protected DecoratorPattern simple;
		
		public AddedDecorator(DecoratorPattern simple){
			this.simple = simple;
		}
		
		@Override
		public void decorate() {
			simple.decorate();
		}
	}
	
	private static class HoneyDecorator extends AddedDecorator {
		
		public HoneyDecorator(DecoratorPattern simple){
			super(simple);
		}
		
		@Override
		public void decorate() {
			simple.decorate(); addHoney();
		}
		
		private void addHoney(){
			System.out.println("Added Honey");
		}
	}
	
	private static class NutsDecorator extends AddedDecorator {
		
		public NutsDecorator(DecoratorPattern simple){
			super(simple);
		}
		
		@Override
		public void decorate() {
			simple.decorate(); addNuts();
		}
		
		private void addNuts(){
			System.out.println("Added Nuts");
		}
	}
}
