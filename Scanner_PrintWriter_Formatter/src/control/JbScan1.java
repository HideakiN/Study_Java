package control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JbScan1 {

	/*
	 * キーボードからの入力例 
	 */
	
	public void Run() {
		
		String ss;
		int idt;
		double ddt;
		
		Scanner kbd = new Scanner(System.in);
		
		try {
			ss = kbd.nextLine();
			System.out.println("１行文字列=" + ss);
			
			ss = kbd.next();
			System.out.println("トークン=" + ss);
			
			idt = kbd.nextInt();
			System.out.println("int値=" + idt);
			
			ddt = kbd.nextDouble();
			System.out.println("double値=" + ddt);
		}
		catch (InputMismatchException e) {
			System.out.println("入力誤り e=" + e);
		}
	}
}
