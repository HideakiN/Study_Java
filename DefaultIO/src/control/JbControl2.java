package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JbControl2 {

	public void Run() {
		
		/*
		 * BufferedReader‚ğg‚Á‚½“ü—Í—á 
		 */
		
		String ss = "";
		
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("----------•¶š—ñ‚Ì‚Ps“ü—Í");
			ss = kbd.readLine();
			System.out.println("tst1=" + ss);
			
			System.out.println("----------•¶š—ñ‚ÌŒJ‚è•Ô‚µ“ü—Í");
			while ((ss = kbd.readLine()) != null) {
				System.out.println("tst2=" + ss);
			}
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
