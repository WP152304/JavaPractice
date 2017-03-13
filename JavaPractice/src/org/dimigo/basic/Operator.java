/**
 * 
 */
package org.dimigo.basic;

/**
 *<pre>
 *org.dimigo.basic
 *  |_Operator
 *
 * 1.개요 :디미베네
 * 2.작성일 : 2017. 3. 13.
 *</pre>
 *
 * @author sec
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		long i = 1700000 , num = 3 , n = 1500;
		System.out.println("월 평균 급여 : "+String.format("%,d",i)+"원");
		System.out.println("점포 내 직원 수 : "+num+"명");
		System.out.println("점포 수 : "+String.format("%,d",n)+"개");
		long year = i*12*3*1500;
		System.out.println("연간 인건비 : "+String.format("%,d",year)+"원");
		

	}

}
