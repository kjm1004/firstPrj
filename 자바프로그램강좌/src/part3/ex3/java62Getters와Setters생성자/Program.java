/*
 * 61강, Getter/Setter
 * */

package part3.ex3.java62Getters와Setters생성자;

import java.util.Scanner;

public class Program {

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
		//ExamList.init(list);
		//list.init();
		
		
		int menu;
		boolean keepLoop = true;
		
		while (keepLoop) {
			
			 menu = inputMenu();
			
			 switch (menu) {
					
			 		case 1:
			 			//ExamList.inputList(list); 
			 			list.inputList();
			 			break;
					case 2:
						//ExamList.printList(list, 2);
						list.printList();
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

	 static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메인메뉴");
		
		System.out.println("\t1. 성적입력");
		System.out.println("\t2. 성적출력");
		System.out.println("\t3. 종료");
		System.out.println("\t선택");
		
		int menu = scan.nextInt();
		
		return menu;
	}

	 

}
