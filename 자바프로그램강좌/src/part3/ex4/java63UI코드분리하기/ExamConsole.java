package part3.ex4.java63UI코드분리하기;

import java.util.Scanner;

public class ExamConsole {

	
	private ExamList list = new ExamList();

	// 인스턴스형 함수
	public void printList() {
		// printList(list, list.current);
		this.printList(list.size());
	}
	
	
	// 매개변수형 함수
	public void printList(int size) {
		System.out.println("성적 출력");
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			
			Exam exam = list.get(i);
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();
			
			int total = exam.total();
			float avg = exam.avg();
			
			System.out.printf("국어 : %d \n", kor);
			System.out.printf("영어 : %d \n", eng);
			System.out.printf("수학 : %d \n", math);
			
			System.out.printf("총점  : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("-------------------");
		}
		
	}

	
	// 인스턴스형 함수
	public void inputList() {

		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력");

				int kor, eng, math;
				
				do {
					System.out.printf("국어 : ");
					kor = scan.nextInt();
					
					if (kor < 0 || 100 < kor)
						System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				} while (kor < 0 || 100 < kor);
				
				do {
					System.out.printf("영어 : ");
					eng = scan.nextInt();
					
					if (eng < 0 || 100 < eng)
						System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
				} while (eng < 0 || 100 < eng);
				
				do {
					System.out.printf("수학 : ");
					math = scan.nextInt();
					
					if (math < 0 || 100 < math)
						System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
				} while (math < 0 || 100 < math);
				
				System.out.printf("현재번호 : %d\n", list.size());
				System.out.println("-------------------");
				
//				Exam exam = new Exam();		// 배열객체 생성 ==> 학생 1명의 국/영/수 성적
//				exam.setKor(kor);
//				exam.setEng(eng);
//				exam.setMath(math);;
				
				Exam exam = new Exam(kor, eng, math);
				
				/*  데이터 추가 */
				list.add(exam);

	}



}
