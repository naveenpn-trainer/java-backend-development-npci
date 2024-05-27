package org.letsupgrade.handson.lambda_expressions_and_functional_interface;

@FunctionalInterface
interface Greeting {
	void greet();
	
}

class Hi implements Greeting{

	@Override
	public void greet() {
		System.out.println("Hi Greeting");
		
	}
	
}

class Greeter2 {
	public void greet(Greeting greeting) {
		greeting.greet();
	}
}

public class _02_Greeter {
	public static void main(String[] args) {
		
		Greeting objHiGreeting = new Hi();
		objHiGreeting.greet();
		
		Greeting objHelloGreeting = new Greeting() {
			
			@Override
			public void greet() {
				System.out.println("Hello Greeting");
				
			}
		};
		objHelloGreeting.greet();
		

		Greeting helloGreet = () -> System.out.println("Hello World Greeeting");
		Greeting hiGreet = () -> System.out.println("Hi World Greeeting");
		Greeting byGreet = () -> System.out.println("Bye World Greeeting");

		Greeter2 greeter = new Greeter2();
		greeter.greet(helloGreet);
		greeter.greet(hiGreet);

	}
}
