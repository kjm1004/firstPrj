/*
 * 46강~48강, 데이터 구조화
 * */

package part2.ex3.java46구조체배열;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {

//	각 성적별 배열객체 선언 방식 : Heap		
//	int[] korlist = new int[3];		
//	int[] englist = new int[3];
//	int[] mathlist = new int[3];
//	korlist[1] = 30;		객체 이므로 heap 메모리에 직접 저장 가능		
	
//	배열 참조 변수(exams) 선언: stack
//	Exam[] exams = new Exam[3]; 	==> exams는 참조변수 이므로 값 저장 불가. 생성자()도 없음
//	exams[0] = new Exam();  		==> 생성자를 통해 Heap 메모리 생성
//	exams[1] = new Exam();
//	exams[2] = new Exam();
		
		// 배열 참조변수(exams) 선언
		Exam[] exams = new Exam[3];

		int menu;
		boolean keepLoop = true;
		
		while (keepLoop) {
			
			 menu = inputMenu();
			
			 switch (menu) {
					
			 		case 1:
			 			inputList(exams);		// 배열 참조변수 전달 (stack), 
			 			break;
		
					case 2:
						printList(exams);
						break;
						
					case 3:	
						keepLoop=false;
						System.out.println("bye ~~~~");
						break;
						
					default:
						System.out.println("잘못된 값 입력");
						break;
			}//switch
		}//while
		
	}//main

	private static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메인메뉴");
		
		System.out.println("\t1. 성적입력");
		System.out.println("\t2. 성적출력");
		System.out.println("\t3. 종료");
		System.out.println("\t선택");
		
		int menu = scan.nextInt();
		
		return menu;
	}

	private static void printList(Exam[] exams) {
		System.out.println("성적 출력");
		System.out.println();

		// i < exams.length  : 배열 갯수(학생수), 각 배열의 성적 갯수가 아님 
		for (int i = 0; i < 3; i++) {
			
			Exam exam = exams[i];
			
			// for 내에서 함수가 선언됨. 연산자가 아니므로 성능에 상관없음
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = kor + eng + math;
			float avg = total / 3.0f;
			
			System.out.printf("국어 : %d \n", kor);
			System.out.printf("영어 : %d \n", eng);
			System.out.printf("수학 : %d \n", math);
			
			System.out.printf("총점  : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("-------------------");
		}

	}

	private static void inputList(Exam[] exams) {
		//Exam[] exams : 참조변수의 주소
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력");

		// 학생은 몇명이 입력될지 모름
		for (int i = 0; i < 3; i++) {
			
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
				
				Exam exam = new Exam();		//배열객체 생성 ==> 학생 1명의 국/영/수 성적
				
				exam.kor = kor;
				exam.eng = eng;
				exam.math = math;
				
				// 매개변수로 받아온 Exam[] exams 참조변수에 exam 배열객체 주소 전달
				exams[i] = exam;			//heap값의 주소를 stack으로 전달
				
				System.out.println("-------------------");
		}//for
			
	}//input

}
