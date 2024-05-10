/*
 * 46강~51강, 데이터 구조화
 * */

package part2.ex3.java49가변길이구조체배열;

import java.util.Scanner;

public class ListProgram {

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
		
		ExamList list = new ExamList();	// 학생단위 참조변수 생성(stack) ==> 학생들 배열
		list.exams = new Exam[3];		// list.exams ==> exam 3개 ==> exam : 국,영,수
		list.current=0;

		int menu;
		boolean keepLoop = true;
		
		while (keepLoop) {
			
			 menu = inputMenu();
			
			 switch (menu) {
					
			 		case 1:
			 			// inputList(exams, current)	==> current 기본변수를 사용하면 참조(주소)가 아닐라 값 전달
			 			inputList(list);		// 배열 참조변수(exams) 주소 전달 (stack), 
			 			break;
					case 2:
						printList(list);
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

	private static void printList(ExamList list) {
		// int current => int size
		
		System.out.println("성적 출력");
		System.out.println();

		int size = list.current;
		Exam[] exams = list.exams;
		
		// i < exams.length  : 배열 갯수(학생수), 각 배열의 성적 갯수가 아님 
		for (int i = 0; i < size; i++) {
			
			Exam exam = exams[i];
			
			/*
						  list.current = 0
						  
			exma.kor  <== list.exams[0].kor
			exma.eng  <== list.exams[0].eng
			exma.math <== list.exams[0].math
						  
						  list.exams[1].kor			
						  list.exams[1].eng			
						  list.exams[1].math 		
						  
						  list.exams[2].kor			
						  list.exams[2].eng			
						  list.exams[2].math 		
			  
			*/

			
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
	private static void inputList(ExamList list) {

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
				
				Exam exam = new Exam();		// 배열객체 생성 ==> 학생 1명의 국/영/수 성적
				exam.kor = kor;
				exam.eng = eng;
				exam.math = math;
				
				/* 구조체 길이 조절(가변길이) ==>list.exams = new Exam[3]; 초기에 3개로 고정 */
				
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

			
	}//input

}
