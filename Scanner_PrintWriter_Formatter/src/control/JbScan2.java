package control;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JbScan2 {

	/*
	 * 文字列からの入力例 
	 */
	
	public void Run() {
		
		String ss;
		int idt;
		double ddt;
		
		String input_ss = "abcd 1234 56.78";
		Scanner sc = new Scanner(input_ss);
		
		try {
			ss = sc.next();
		}
		catch (InputMismatchException e) {
			
		}
		
	}
}
