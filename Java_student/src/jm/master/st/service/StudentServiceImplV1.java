package jm.master.st.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jm.master.st.domain.StudentVO;

public class StudentServiceImplV1 implements StudentService {

	/*
	 * 전역변수로 키보드로 입력받는 scanner, get set 해놓은 StudentVO를 리스트로 선언, 저장할 파일 String형으로
	 * stdFile선언
	 * 
	 */

	private Scanner scan;
	private String stdFile;
	private List<StudentVO> stdList;
	private StudentVO sVO;

	// 생성자를 이용하여 전역변수로 선언해놓은 것들 초기화
	public StudentServiceImplV1(Scanner scan, String stdFile) {
		this.scan = scan;
		this.stdFile = stdFile;
		this.stdList = new ArrayList<StudentVO>();
	}

	@Override
	public boolean inputNum() {
		// StudentVO 인스턴스 생성
		sVO = new StudentVO();
		while (true) {
			System.out.println("학번(QUIT:종료)");
			String strInput = scan.nextLine();

			if (strInput.contentEquals("OUIT")) {
				return false;
			}

			if (stdList.stream().filter(vo -> vo.getNum().equals(strInput)).count() > 0) {
				System.out.println("이미 저장된 학번입니다.");
			}

			sVO.setNum(strInput);
			break;

		}
		return true;
	}

	@Override
	public boolean inputName() {
		while (true) {
			System.out.println("이름(QUIT:종료)");
			String strInput = scan.nextLine();

			if (strInput.isEmpty()) {
				System.out.println("이름은 반드시 입력해야 합니다.");
				continue;
			}
			sVO.setName(strInput);
			break;
		}
		return true;
	}

	@Override
	public boolean inputDept() {
		while (true) {
			System.out.print("학과(QUIT:종료)");
			String strInput = scan.nextLine();

			if (strInput.equals("QUIT")) {
				return false;
			}

			if (strInput.isEmpty()) {
				System.out.println("학과명은 반드시 입력해야합니다.");
				continue;
			}
			sVO.setDept(strInput);
			break;
		}
		return true;
	}

	@Override
	public boolean inputGrade() {

		while (true) {
			System.out.println("학년(OUIT:종료)");
			String strInput = scan.nextLine();

			if (strInput.equals("QUIT")) {
				return false;
			}

			int intGrade = 0;
			try {
				intGrade = Integer.valueOf(strInput);
			} catch (Exception e) {
				System.out.println("학년은 숫자로만 입력해야 합니다.");
				continue;
			}

			if (intGrade < 1 || intGrade > 4) {
				continue;
			}
			sVO.setGrade(intGrade);
			break;

		}
		return true;
	}

	@Override
	public boolean inputTel() {
		while(true) {
			System.out.println("전화번호(QUIT:종료)");
			String strInput = scan.nextLine();
			
			if(strInput.equals("QUIT")) {
				return false;
			}
			sVO.setTel(strInput);
			break;
		}
		return true;
	}

	@Override
	public boolean saveStudent() {
		
		try {
			FileWriter file = new FileWriter(stdFile,true);
			PrintWriter out = new PrintWriter(file);
			
			String strSave = String.format("%s:%s:%s:%d:%s",
					sVO.getNum(),
					sVO.getName(),
					sVO.getDept(),
					sVO.getGrade(),
					sVO.getTel());
			out.println(strSave);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stdList.add(sVO);
		return true;
	}

	@Override
	public boolean loadStudent() {
		try {
			FileReader file = new FileReader(stdFile);
			BufferedReader buffer = new BufferedReader(file);
			String reader = "";
			while((reader = buffer.readLine()) != null) {
				String[] student = reader.split(":");
				StudentVO sVO = new StudentVO();
				sVO.setNum(student[0]);
				sVO.setName(student[1]);
				sVO.setDept(student[2]);
				sVO.setGrade(Integer.valueOf(student[3]));
				sVO.setTel(student[4]);
				stdList.add(sVO);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

}
