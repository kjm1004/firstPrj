package part3.ex5.java78추상메소드구현body;

import java.util.Scanner;

public class ExamList{
	private Exam[] exams;	// 참조변수 배열 선언(stack), 학생 단위
	private int current;
	
	public ExamList() {
		this.exams = new Exam[3];
		this.current=0;
	}


	
	 public Exam get(int i) {
		// TODO Auto-generated method stub
		return this.exams[i];
	}

	// 매개변수형 함수 
	 public static void inputList(ExamList list) {

		//Exam[] exams : 참조변수의 주소
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력");

		// 학생은 몇명이 입력될지 모름
			
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
				
				System.out.printf("현재번호 : %d\n", list.current);
				System.out.println("-------------------");
				
				//Exam exam = new Exam();		// 배열객체 생성 ==> 학생 1명의 국/영/수 성적
				//exam.kor = kor;
				//exam.eng = eng;
				//exam.math = math;
				
				// setter getter
//				Exam exam = new Exam();
//				exam.setKor(kor);
//				exam.setEng(eng);
//				exam.setMath(math);
				
				
				// 생성자 오버로드
				Exam exam = new Exam(kor, eng, math);
				
				
				/* 구조체 길이 조절(가변길이) ==>list.exams = new Exam[3]; 초기에 3개로 고정 */
				Exam[] exams = list.exams;//배열 참조변수 생성 
				int size = list.current;
				
				if (exams.length == size) {
					Exam[] temp = new Exam[size + 5];
					for (int i = 0; i < size; i++) 
						temp[i] = exams[i];
					list.exams = temp;	
				}

				
				
				list.exams[list.current] = exam;   
				list.current++;
				/*
				  list.current = 0
				  
				  list.exams[0].kor	  <== exma.kor
				  list.exams[0].eng	  <== exma.eng
				  list.exams[0].math  <== exma.math
				  
				  list.exams[1].kor			
				  list.exams[1].eng			
				  list.exams[1].math 		
				  
				  list.exams[2].kor			
				  list.exams[2].eng			
				  list.exams[2].math 		
				  
				*/

			
	}
	 
	/*
	 기존 
	 Exam[] exams = this.exams 
	 temp[i] = exams[i];
	 this.exams = temp;
	 
	 개선
	 Exam[] exams = this.exams 
	 temp[i] = exams[i];
	 this.exams = temp;
	*/
	 
	 
	 public void add(Exam exam) {
		Exam[] exams = this.exams;							// 기존 값 저장
		int size = this.current;
		
		if (exams.length == size) {
			Exam[] temp = new Exam[size + 1];				// 증가 배열 생성
			for (int i = 0; i < size; i++) 					
				temp[i] = exams[i];							// 임시값을 증가된 임시배열에 복사
			this.exams = temp;								// 임시값을 
		}
		
		this.exams[this.current] = exam;   
		this.current++;
		
	}



	public int size() {
		return current;
	}
	 
}
