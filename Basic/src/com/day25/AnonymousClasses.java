package com.day25;

public class AnonymousClasses {
	
	interface HelloWorld{
		public void greet();
		public void greetSomeone(String someone);
	}
	
	public void SayHello() {
		
		class EnglishGreeting implements HelloWorld{
			String name = "world";

			@Override
			public void greet() {
				greetSomeone("world");
				
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
				
			}
		}
			
			HelloWorld englishGreeting = new EnglishGreeting();
			
			HelloWorld frenchGreeting = new HelloWorld() {
				String name = "tout le monde";				

				@Override
				public void greet() {
					 String greetSomeone = "tout le monde";
					
				}

				@Override
				public void greetSomeone(String someone) {
					System.out.println("Salut " + name);
					
				}
				
			};
			
			HelloWorld spanishGreeting = new HelloWorld() {
				String name = "mundo";

				@Override
				public void greet() {
					String greetSomeOne = "mundo";
					
				}

				@Override
				public void greetSomeone(String someone) {
					System.out.println("Hola " + name);
					
				}
			};
			
			englishGreeting.greet();
			frenchGreeting.greetSomeone("Fred");
			spanishGreeting.greet();
		
	}
	
	public static void main(String[] args) {
		
		AnonymousClasses myApp = new AnonymousClasses();
		myApp.SayHello();
		
	}

}
