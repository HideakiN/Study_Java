package control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JbControl3 {
	/*
	 * ���l�̓���
	 */

	public void Run() {
		
		BufferedReader kbd = new BufferedReader(new InputStreamReader(System.in));
		
		String ss;
		int idt;
		double ddt;
		
		while (true) {
			try {
				System.out.print("��������͂��Ă�������: ");
				ss = kbd.readLine();
				idt = Integer.parseInt(ss);	/* �����ȊO(���������_�Ȃ�)�͗�O�ƂȂ� */
				System.out.println("����=" + idt);
				break;
			}
			catch (IOException e) {
				System.out.println(e);
				break;
			}
			catch (NumberFormatException e) {
				/* ���l�ȊO�̕������܂܂�Ă��� */
				System.out.println("���͌��");
				continue;
			}
		}
		
	}
}
