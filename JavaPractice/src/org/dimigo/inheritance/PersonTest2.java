/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 *inheritance
 *  |_PersonTest
 *
 * 1.개요 :
 * 2.작성일 : 2017. 4. 26.
 *</pre>
 *
 * @author sec
 * @version : 1.0
 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person[] people = {
				 new Person("Tom"),
				 new Korean("홍길동"),
				 new Japanese("다나카"),
				 new Chinese("왕밍")
		
		};
		for(Person p : people){
		greeting(p);
		System.out.println();
	}
		
	}
	
	private static void greeting(Person p) {
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		
	}

}
