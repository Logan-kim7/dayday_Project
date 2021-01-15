import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class StudentEx_01 {
	
	private static final int ST_NUM = 0;
	private static final int ST_NAME = 1;
	private static final int ST_DEPT = 2;
	private static final int ST_GRADE = 3;
	private static final int ST_TEL = 4;
	
	
	public static void main(String[] args) {
		String saveFile = "src/student.txt";
		Scanner scan = new Scanner(System.in);
		String[] arrStudent = new String[5];
		
		FileWriter fileWriter = null;
		PrintWriter out = null;
		
		
		System.out.println("학번(QUIT:종료) >>");
		arrStudent[ST_NUM] = scan.nextLine();
		
		System.out.println("이름(QUIT:종료) >>");
		arrStudent[ST_NAME] = scan.nextLine();
		
		System.out.println("학과(QUIT:종료) >>");
		arrStudent[ST_DEPT] = scan.nextLine();
		
		System.out.println("학년(QUIT:종료) >>");
		arrStudent[ST_GRADE] = scan.nextLine();
		
		System.out.println("전화번호(QUIT:종료) >>");
		arrStudent[ST_TEL] = scan.nextLine();
		
		String strStudent = "";
		for(String s : arrStudent) {
			strStudent += s + ":";
		}
			strStudent = strStudent.substring(0,strStudent.length() -1);
			
			
			try {
				fileWriter = new FileWriter(saveFile,true);
				out = new PrintWriter(fileWriter);
				
				out.println(strStudent);
				
				out.flush();
				out.close();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(saveFile + "파일을 생성할 수 없음");
			}
		
			System.out.println(strStudent);
			
			scan.close();
	}



}
