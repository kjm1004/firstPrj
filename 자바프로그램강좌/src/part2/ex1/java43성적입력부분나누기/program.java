/*
 * 구조적인 프로그래밍 강의
 * 39강 ~ 42강
 * */

package part2.ex1.java43성적입력부분나누기;

import java.util.Scanner;


public class program {
	

	public static void main(String[] args) {

		int[] korlist = new int[3];		// 함수에서 공통 변수 선언 시 static, 내부에서는 생략
		int menu;
		boolean keepLoop = true;
		
		while (keepLoop) {
			
			 menu = inputMenu();
			
			 switch (menu) {
					
			 		case 1:
			 			inputKors(korlist);		// 변수 주소 전달
			 			break;
		
					case 2:
						printKors(korlist);
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

	private static void printKors(int[] kors) {
		
		
		int total = 0;
		float avg ;
		
		
		for (int i = 0; i < 3; i++) 
			total += kors[i]; 
		
		avg = total / 3.0f;
		System.out.println("성적출력");
		
		for (int i = 0; i < 3; i++) 
			System.out.printf("국어 :%d, %3d", 3+1, kors[i]);
		
		System.out.printf("총점 : %3d\n",total);
		System.out.printf("평균 : %3f\n",avg);
		System.out.println("----------------");
		
	}

	private static void inputKors(int[] kors) {
		int kor;// 배열을 계산에 사용하는 것은 좋지 않음. 임시변수 사용 kor
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적입력");
		
		for(int i=0;i<3;i++){
			
			do {
				System.out.printf("국어 :%d", i+1);
				kor = scan.nextInt();
				if (kor < 0 || 100 < kor)
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				
			} while (kor < 0 || 100 < kor);
			
			kors[i] = kor;
			
		}//for
		
		System.out.println("----------------");
		
	}//성적입력

}
