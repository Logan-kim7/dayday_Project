package jm.master.st.service;

public interface StudentService {
	/*
	 * 입력받은 값을 설정하기위해
	 * input매서드 를 boolean형으로 선언 
	 * 
	 * 입력받을 값을 저장, 불러오기위해 
	 * save, load 매서드 선언
	 * 
	 */
	public boolean inputNum();
	public boolean inputName();
	public boolean inputDept();
	public boolean inputGrade();
	public boolean inputTel();
	
	public boolean saveStudent();
	public boolean loadStudent();

}
