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
public class PersonTest {
	public static void main(String[] args) {
		Person d = new Person("Tom");
		Person a = new Korean("홍길동");
		Person b = new Japanese("다나카");
		Person c = new Chinese("왕밍");

		System.out.println(d);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		

		System.out.println();

		d.sayHello();
		a.sayHello();
		b.sayHello();
		c.sayHello();

		System.out.println();

		d.sayBye();
		a.sayBye();
		b.sayBye();
		c.sayBye();
	}

}
