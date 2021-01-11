package com.master.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.master.book.domain.BookVO;

public class JueService {
	
	//변수, 인스턴스는 private 나 protected로 선언하는것이 좋다
	
	private List<BookVO> bookList;
	private Scanner scan;
	private BookVO bookVO = new BookVO();
	
	
	//생성자 이용한 초기화
	public JueService() {
		bookList = new ArrayList<>();
	}
	
	public boolean inputBook() {
		System.out.println("도서코드를 입력하세요!!");
		String code = scan.nextLine();
		
		//보다시피 입력받은 것은 문자열이고
		// try 문 안쪽에있는 것은 문자열을 숫자로 변환 해주었다
		// 에러가 발생했을시 작업이 중단되는 것을막고
		// 사용자가 다시 정확한 값을 입력하거나 다른 동작을
		// 할수 있게끔 해주는것
		try {
			code = String.format("%05d", Integer.valueOf(code));
		
			
			if(code.length() > 5) {
				System.out.println("도서코드는 1~5자리만 유효합니다.");
				System.out.println("다시입력하세요");
				
				return false;
			}
		} catch (Exception e) {
			
		}
		
		bookVO.setCode(code);
		
		
		while(true) {
			System.out.println("도서명을 입력하세요");
			String name = scan.nextLine();
			
			
			
			try {
				
				if(name.isEmpty()) {
					System.out.println("도서명은 반드시 입력해야 합니다.");
					System.out.println("도서명을 다시입력하세요");
					continue;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			bookVO.setName(name);
			
			System.out.println("도서가격을 입력하세요");
			String strPrice = scan.nextLine();
			
			int Price = 0;
			try {
				Price = Integer.valueOf(strPrice);
			} catch (Exception e) {
				
				System.out.println("숫자로 입력하세요");
			} 
			bookVO.setPrice(Price);
			bookList.add(bookVO);
			return true;
		}
	}
}
