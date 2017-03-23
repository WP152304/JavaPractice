/**
 * 
 */
package org.dimigo.basic;

import java.util.Scanner;
import java.util.Random;

/**
 *<pre>
 *org.dimigo.basic
 *  |_Loop
 *
 * 1.개요 :초간단 게임 프로그램
 * 2.작성일 : 2017. 3. 15.
 *</pre>
 *
 * @author sec
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		      int at = 100;
		      int choice;
		      String[] job = { "마법사", "영주", "기사", "농민" };
		      Scanner scanner = new Scanner(System.in);
		      int r;

		      do {
		         System.out.println("--------------------");
		         System.out.println("<< 게임 메뉴 >>");
		         System.out.println("1. 공격력 증가");
		         System.out.println("2. 공격력 감소");
		         System.out.println("3. 캐릭터 설정");
		         System.out.println("9. 종료");
		         System.out.println("--------------------");
		         
		         System.out.print("메뉴 선택 ==>");
		         choice = scanner.nextInt();

		         switch (choice) {
		         case 1: {
		            at += 10;
		            System.out.println("공격력이 증가하였습니다. 현재 공격력 : " + at);
		         }
		            break;
		         case 2: {
		            at -= 10;
		            System.out.println("공격력이 감소하였습니다. 현재 공격력 : " + at);
		         }
		            break;
		         case 3: {
		            Random random = new Random();
		            r = random.nextInt(4);
		            System.out.printf("%s(으)로 설정되었습니다.\n", job[r]);
		         }
		            break;
		         default:
		            System.out.println("없는 메뉴 입니다!!");
		         }
		      } while (choice != 9);
		      System.out.println("이제 공부하세요~");
		      scanner.close();


	}

}
