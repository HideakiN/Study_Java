package control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JbScan1 {

	/*
	 * �L�[�{�[�h����̓��͗� 
	 */
	
	public void Run() {
		
		String ss;
		int idt;
		double ddt;
		
		Scanner kbd = new Scanner(System.in);
		
		try {
			ss = kbd.nextLine();
			System.out.println("�P�s������=" + ss);
			
			ss = kbd.next();
			System.out.println("�g�[�N��=" + ss);
			
			idt = kbd.nextInt();
			System.out.println("int�l=" + idt);
			
			ddt = kbd.nextDouble();
			System.out.println("double�l=" + ddt);
		}
		catch (InputMismatchException e) {
			System.out.println("���͌�� e=" + e);
		}
	}
}
