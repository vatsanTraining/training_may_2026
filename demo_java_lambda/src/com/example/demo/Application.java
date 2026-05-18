package com.example.demo;

public class Application {

	public static void print(Runnable runnable) {
		
		Thread t = new Thread(runnable);
		
		t.start();
	}
	public static void main(String[] args) {

		Runnable task = new Runnable() {
			
			@Override
			public void run() {

				for(int i =0;i<=5;i++) {
					System.out.println("Hello");
				}
			}
		};
		
		Thread thread = new Thread(task);
		
		thread.start();
		
		
		Runnable lambda = () -> {
		
			for(int i =0;i<=5;i++) {
				System.out.println("Thanks");
			}

		};
		
print(lambda);	

		
		print(()->{
			
			for(int i =0;i<=5;i++) {
				System.out.println("Bye");
			}
		});
		

			}

}
