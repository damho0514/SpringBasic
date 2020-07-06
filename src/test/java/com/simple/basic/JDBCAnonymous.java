package com.simple.basic;

interface Car{
	public void run();
}


public class JDBCAnonymous {
	
	public void test() {
		
		Car car = new Car() {
			
			@Override
			public void run() {
				System.out.println("결과...");
			}
		};
		
		
		car.run();
		
		//익명클래스기법 - 보통의경우네는 별도 클래스를 생성해서 쓰지만,
		//재사용할 일이 없는 1회성 클래스는 익명클래스로 빠르게 생성해서 사용합니다
	}
}
