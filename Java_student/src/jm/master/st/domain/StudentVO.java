package jm.master.st.domain;

public class StudentVO {
	/*
	 * private 키워드를 활용하여 
	 * 학번 이름 과목 학년 전화번호 
	 * 각 형식에 맞게 선언
	 * 
	 * private는 선언한 클래스안에서만 쓸수있기때문에
	 * 다른클래스에서 쓰도록 get set 선언 
	 */
	private String num;
	private String name;
	private String dept;
	private int grade;
	private String tel;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	

}
