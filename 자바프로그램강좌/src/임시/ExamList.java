package 임시;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;		// 단지 Exam 클래스의 배열이라고 선언, 배열 크기도 없음 
	int current;
	
	// 객체.함수() 스타일에서는 객체명이 매개변수이며, 구현된 함수에서는 매개변수를 생략하고 묵시적으로 사용
	public void input() {
		Scanner scan = new Scanner(System.in);
		
		int kor, eng, math;
		
		System.out.println("성적 입력");
		
		System.out.printf("국어 : ");
		kor = scan.nextInt();
		
		System.out.printf("영어 : ");
		eng = scan.nextInt();
		
		System.out.printf("수학 : ");
		math = scan.nextInt();
		
		Exam exam = new Exam();		//list.exams[3] 배열객체의 1단위로 입력하기 위한 객체 
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
		this.exams[this.current] = exam; 
		this.exams[1] = exam; 
		this.exams[2] = exam; 
	}

	public void output() {
		
		int kor, eng, math;
		
		Exam[] exams = this.exams;
		
		System.out.println("성적 출력");
		for (int i = 0; i < exams.length; i++) {
			Exam exam = exams[i];
			
			kor = exam.kor;
			eng = exam.eng;
			math = exam.math;
			
			System.out.printf("국어 : %d \n", kor);
			System.out.printf("영어 : %d \n", eng);
			System.out.printf("수학 : %d \n", math);
			System.out.println("-------------------");
		}
		
	}
}
