/*
 * 61강, Getter/Setter
 * */

package part3.ex4.java63UI코드분리하기;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		ExamConsole list = new ExamConsole();
		
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
