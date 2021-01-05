package com.master.jm;

public class master_02 extends Master_01 {


	
	public static void main(String[] args) {
		/*
		 * 이런식으로 다른 클래스에서
		 * 기존에 만들어놓았던 기능(method)들에대해 
		 * 사용이 가능하다.
		 * 
		 * 다른 클래스에서만든 객체를
		 * 사용하기위해서는 일정의 제약조건이 따른다.
		 * 1. main() 이라는 매서드가 필요하다. main() 메서드는 JDK안에 있다.
		 * 2. Java에는 JDk라는 일종의 매서드 창고가 존재한다.(이미 기능이 완성되어있어서 하는역할이 정해져있는 method들)
		 *  JDK는 Java를 설치하면 자동적으로 설치되어있다.  
		 *   
		 *  main() method 를 활용하여 
		 *  현재 클래스에 다른 클래스에 있는 method를 가져올수가있다.
		 *  그리고 실행도 시킬수가있다.
		 *  
		 */
		
		//   인스턴스
		Master_01 rbmaster = new Master_01();
		
		//Master_01에서 가져온 매서드들 
		rbmaster.armsMoving();
		rbmaster.legsMoving();
		rbmaster.headMoving();
		
	}
	
	
	

 
	
}
