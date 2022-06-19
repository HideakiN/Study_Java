package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JbControl3 {
	/*
	 * 数値の入力
	 */

	public void Run() {
		
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		
		String ss;
		int idt;
		double ddt;
		
		while (true) {
			try {
				System.out.print("整数を入力してください: ");
				ss = kbd.readLine();
				idt = Integer.parseInt(ss);	/* 整数以外(浮動小数点など)は例外となる */
				System.out.println("整数=" + idt);
				break;
			}
			catch (IOException e) {
				System.out.println(e);
				break;
			}
			catch (NumberFormatException e) {
				/* 数値以外の文字が含まれていた */
				System.out.println("入力誤り");
				continue;
			}
		}
		
	}
}
