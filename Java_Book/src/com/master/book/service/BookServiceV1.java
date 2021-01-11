package com.master.book.service;

import java.util.Scanner;

import com.master.book.conf.Lines;

public class BookServiceV1 {
	/* 
	 * 
	 * 인스턴스 변수에 
	 * 접근 제한 키워드인 private 를 붙여서 
	 * 생성을한후 
	 * 
	 * 생성자에서 초기화를 시켜주어 
	 * BookServiceV1 매서드안에서 
	 * 사용이 가능하도록 해준다.
	 * 
	 * 이런식으로 인스턴스변수를
	 * 생성자에 초기화를하면
	 * 인스턴스를 따로생성하지 않고도
	 * 사용이 가능하다.
	 * 
	 * 인스턴스변수와 클래스변수의 차이점
	 * class안에서 static이라는 키워드가 붙으면
	 * 클래스 변수이다.
	 * 인스턴스 변수 + 클래스변수 = 맴버변수
	 * 
	 * 매서드 안에서 선언된변수를 지역변수라고하고
	 * 매서드(매개변수) << ( ) 안에서 선언된변수를 매개변수라고한다
	 * 
	 * 지역변수는 반드시 사용전에 초기화를 해주어야한다.
	 * 
	 * 맴버변수와 배열의 경우에는 초기화는 선택적이다.
	 * 
	 *맴버변수의 초기화방법
	 *1 명시적 초기화  int intNum = 0; << 변수의 선언과 동시에 초기화하는방법
	 *
	 *2. 생성자를 이용한 초기화
	 *	class BookServiceV1{
	 *		int intNum;		
	 *
	 *	public BookServiceV1(){  << 생성자
	 *			intNum = 0;
	 *
	 *   }	
	 *	
	 *}
	 *
	 *굳이 이렇게까지 하는이유
	 *
	 *코드가 간결해지고 코드의신뢰성과 오류의 가능성을 줄여줌
	 *
	 *
	 *각 변수별 초기화 시점
	 *클래스변수 : 클래스가 처음로딩될때 단한번 초기화
	 *인스턴스변수 : 인스턴스가 생성될 때마다 각 인스턴스별로 초기화
	 *
	 *3. 초기화 블럭
	 *
	 * 보통 생성자를 이용한 초기화를 주로 사용하기때문에
	 * 많이 사용하지 않는방법
	 * 
	 * class BookServiceV1 {
	 * 	static{   }  << 클래스 초기화 블럭
	 * 
	 * {   } << 인스턴스 초기화 블럭
	 * }
	 * 
	 *
	 * 
	 *  
	 *  
	 * 
	 * 
	 */

	private Scanner scan;
	private String strBCode;
	private String strBName;

	public BookServiceV1() {
		scan = new Scanner(System.in);
		strBCode = "";
		strBName = "";

	}

	public void inputMain() {
		while (true) {
			System.out.println(Lines.dLines());
			System.out.println("도서관 도서정보 관리V1");
			System.out.println(Lines.sLines(50));
			
			this.strBCode = this.inputBCode();
			if(strBCode.equals("QUIT")) {
				break;
			}
			
			this.strBName = this.inputBName();
			if(strBName.equals("QUIT")) {
				break;
			}
			System.out.println(Lines.dLines());
			
			this.printBookInfo();
		}
		System.out.println("업무를 종료합니다!!!");
		return;
	}

	private String inputBCode() {
		String strBCode = "";
		while (true) {
			System.out.println("도서코드(QUIT:종료) >>");
			strBCode = scan.nextLine();

			if (strBCode.equals("QUIT")) {
				return "QUIT";
					
			}
			
			int intBCodeLength = strBCode.length();
			if(intBCodeLength < 0 || intBCodeLength > 5) {
				System.out.println("도서코드는 13자리 이내의 숫자로 입력하세요");
				continue;
			}
			
			int intBCode = 0;
			try {
				intBCode = Integer.valueOf(strBCode);
				
			} catch (Exception e) {
				System.out.println("도서코드에 문자열이 포함되어 있습니다.");
				System.out.println("도서코드는 13자리 이내의 숫자로 입력하세요");
			}
			
			strBCode = String.format("%013d", intBCode);
			break;

		}
		return strBCode;
	}

	private String inputBName() {
		String strBName = "";
		while (true) {
			System.out.println("도서명(QUIT:종료) >>");
			strBName = scan.nextLine();

			if (strBName.equals("QUIT")) {
				return "QUIT";
			}
			if (strBName.isEmpty()) {
				System.out.println("도서명은 반드시 입력해야 합니다.");
				continue;
			}
			break;
		}
		return strBName;

	}

	private void printBookInfo() {
		System.out.println(Lines.dLines());
		System.out.println("입력한 도서정보");
		System.out.println(Lines.sLines());
		System.out.printf("도서코드 : %s\n", this.strBCode);
		System.out.printf("도서명 : %s\n", this.strBName);
		System.out.println(Lines.dLines());
	}

}
