/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 *  |_CarTest
 *
 * 1.개요 :
 * 2.작성일 : 2017. 3. 23.
 *</pre>
 *
 * @author sec
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("<<자동차 목록>>");
		car.setCompany("현대자동차");
		
		car.setModel("제네시스");
		car.setColor("검정색");
		car.setMaxSpeed(225);
		car.setPrice(50000000);
		
		System.out.println("제조사명 : "+car.getCompany());
		System.out.println("모델명 : "+car.getModel());
		System.out.println("색상 : "+car.getColor());
		System.out.println("최대속도 : "+car.getmaxSpeed()+"km");
		System.out.printf("가격 : %,d원\n",car.getPrice());
		System.out.println("\n");
		
		
		Car car1 = new Car();
		car1.setCompany("기아자동차");
		car1.setModel("K7");
		car1.setColor("흰색");
		car1.setMaxSpeed(246);
		car1.setPrice(40000000);
		
		System.out.println("제조사명 : "+car1.getCompany());
		System.out.println("모델명 : "+car1.getModel());
		System.out.println("색상 : "+car1.getColor());
		System.out.println("최대속도 : "+car1.getmaxSpeed()+"km");
		System.out.printf("가격 : %,d원\n",car1.getPrice());
		System.out.println("\n");
		
		Car car2 = new Car();
		car2.setCompany("삼성자동차");
		car2.setModel("SM7");
		car2.setColor("회색");
		car2.setMaxSpeed(200);
		car2.setPrice(38000000);
		
		System.out.println("제조사명 : "+car2.getCompany());
		System.out.println("모델명 : "+car2.getModel());
		System.out.println("색상 : "+car2.getColor());
		System.out.println("최대속도 : "+car2.getmaxSpeed()+"km");
		System.out.printf("가격 : %,d원\n",car2.getPrice());
		System.out.println("\n");
	}

}
