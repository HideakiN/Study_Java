package control;

import java.io.*;

public class JbControl {
	/* System.in���g�����ǂݍ��݂͐F�X��肠��׎��p�I�łȂ�
	 * System.in��ʂ̃N���X�Ɍ��т��Ďg�p���ׂ�
	 */
	public void Run() {
		
		byte[] bdt = new byte[80];
		String ss = "";
		int idt, nn;
		
		try {
			while (true) {
				idt = System.in.read();
				if (idt == '\n') break;
				System.out.print((char)idt);
			}
			System.out.println();
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try {
			nn = System.in.read(bdt, 0, 80);
			ss = new String(bdt, 0, nn);
			System.out.print("ss=" + ss);
		} catch (IOException e) {
			System.out.println(e);
		}
		
		System.err.println("System.err�ɂ��o��");
	}
}
