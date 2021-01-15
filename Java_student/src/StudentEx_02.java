import java.util.Scanner;

import jm.master.st.service.StudentService;
import jm.master.st.service.StudentServiceImplV1;

public class StudentEx_02 {
	
	public static void main(String[] args) {
		String stdFile = "src/student.txt";
		Scanner scan = new Scanner(System.in);
		StudentService sService = new StudentServiceImplV1(scan, stdFile);
		
		boolean ret = true;
		while(ret) {
			sService.loadStudent();
			ret = sService.inputNum()
					&& sService.inputNum()
					&& sService.inputName()
					&& sService.inputDept()
					&& sService.inputTel()
					&& sService.saveStudent();
		}
		System.out.println("업무종료");
	}

}
