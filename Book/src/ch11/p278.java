package ch11;

import java.util.Scanner;

public class p278 {
	
	static String user_id = "seo";
	static String user_pw = "smg1234";
	
	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("���̵� : ");
			String input_id = scan.nextLine();		
			System.out.print("��й�ȣ : ");
			String input_pw = scan.nextLine();
			
			if (!user_id.equals(input_id)) {
				throw new p277("���̵� �ùٸ��� �ʽ��ϴ�.");
			} else if (!user_pw.equals(input_pw)) {
				throw new p277("��й�ȣ�� �ùٸ��� �ʽ��ϴ�.");
			} else {
				System.out.println("�α��� ����");
			}			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}