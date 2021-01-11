package com.master.book.service;

import java.util.Scanner;

import com.master.book.conf.Lines;

public class BookEx_01 {
	
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		
		String strBCode = "";
		String strBName = "";
		
		while(true) {
			System.out.println("도서코드(OUIT:종료) >> ");
			strBCode = scan.nextLine();
			
			int intBCodeLength = strBCode.length();
			if(intBCodeLength < 0 || intBCodeLength >5) {
				System.out.println("도서코드는 5자리 이내의 숫자로 입력하세요");
				continue;
			}
			
			int intBCode= 0;
			try {
				intBCode = Integer.valueOf(strBCode);
				
			} catch (Exception e) {
				System.out.println("도서코드는 숫자로만 입력해야 합니다.");
				continue;
			}
			strBCode = String.format("%05d", intBCode);
			break;
		}
		
		while(true) {
			System.out.println("도서명(OUIT:종료) >>");
			strBName = scan.nextLine();
			
			if(strBName.isEmpty()) {
				System.out.println("도서명은 반드시 입력해야 합니다.");
				continue;
			}
			break;
		}
		
		System.out.println(Lines.dLines());
		System.out.println("입력한 도서정보");
		System.out.println(Lines.sLines());
		System.out.printf("도서코드 : %s\n", strBCode);
		System.out.printf("도서코드 : %s\n", strBName);
		System.out.println(Lines.dLines());
		scan.close();
	}

}
