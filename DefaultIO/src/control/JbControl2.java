package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JbControl2 {

	public void Run() {
		
		/*
		 * BufferedReaderを使った入力例 
		 */
		
		String ss = "";
		
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("----------文字列の１行入力");
			ss = kbd.readLine();
			System.out.println("tst1=" + ss);
			
			System.out.println("----------文字列の繰り返し入力");
			while ((ss = kbd.readLine()) != null) {
				System.out.println("tst2=" + ss);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
