package org.dimigo.oop;

public class PiggyBank {
	
	public static int balance = 0;
	   
    public static void putMoney(FamilyMember fm, int amount) {
       System.out.println(fm.getmemberName() + " : " + amount + "원 넣음");
       balance += amount;
    }
    
    public static void printBalance() {
       System.out.println("돼지저금통 총 금액 : " + balance + "원");
    }

}
