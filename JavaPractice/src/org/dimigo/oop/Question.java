/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *org.dimigo.oop
 *  |_Question
 *
 * 1.개요 :
 * 2.작성일 : 2017. 3. 31.
 *</pre>
 *
 * @author sec
 * @version : 1.0
 */
public class Question {

   /**
    * @param args
    */
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      String[] questions = {"가장 좋아하는 가수는?","가장 좋아하는 배우는?", "가장 좋아하는 괴목은?" };
      StringBuilder[] prints = { new StringBuilder(questions[0]), new StringBuilder(questions[1]),
            new StringBuilder(questions[2]) };
      String[] answers = {"트와이스", "사나","응용 프로그래밍"};
      String buff;
      Scanner scan = new Scanner(System.in);
      for (int i = 0; i < questions.length; i++) {
         System.out.println("" + (i + 1) + "." + questions[i]);
         buff = scan.nextLine();
         System.out.println(buff.equals(answers[i]) ? "정답입니다!" : "틀렸습니다!");
      }
      System.out.println("<< 결과 출력 >>");
      for (int i = 0; i < questions.length; i++) {
         System.out.println(prints[i].append(answers[i]).append("입니다."));
      }
   }

}