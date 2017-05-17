/**
 * 
 */
package org.dimigo.abstractclass;

/**
 *<pre>
 *org.dimigo.inheritance
 *  |_SmartPhoneTest
 *
 * 1.개요 :
 * 2.작성일 : 2017. 5. 12.
 *</pre>
 *
 * @author sec
 * @version : 1.0
 */
public class SmartPhoneTest {

	   public static void main(String[] args) {
	      SmartPhone[] smartPhone = new SmartPhone[]{
	            new IPhone("iPhone 7","애플",900000),
	            new Galaxy("갤럭시 S8","삼성",800000)
	      };
	      
	      for (SmartPhone phone : smartPhone){
	         System.out.println(phone.toString());
	         phone.turnOn();
	         phone.pay();
	         phone.useSpecialFunction();
	         phone.turnOff();
	         System.out.println();
	      }
	      
	   }

	}