/*
 * 구조적인 프로그래밍 강의
 * 39강 ~ 42강
 * */

package part2.ex1.java40성적입력부분나누기;

import java.util.Scanner;


public class program {
	
	static int[] kors = new int[3];		// 함수간 공통 변수 선언 시 static

	public static void main(String[] args) {

		int menu;
		boolean keepLoop = true;
		
		while (keepLoop) {
			
			 menu = 메뉴입력();
			
			 switch (menu) {
					
			 		case 1:
			 			성적입력();
			 			break;
		
					case 2:
						성적출력();
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

	private static int 메뉴입력() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메인메뉴");
		
		System.out.println("\t1. 성적입력");
		System.out.println("\t2. 성적출력");
		System.out.println("\t3. 종료");
		System.out.println("\t선택");
		
		int menu = scan.nextInt();
		
		return menu;
	}

	private static void 성적출력() {
		
		
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

	private static void 성적입력() {

		Scanner scan = new Scanner(System.in);

		System.out.println("성적입력");
		
		for(int i=0;i<3;i++)
			do {
				System.out.printf("국어 :%d", i+1);
				kors[i] = scan.nextInt();
				if (kors[i] < 0 || 100 < kors[i])
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				
			} while (kors[i] < 0 || 100 < kors[i]);
		System.out.println("----------------");

		
	}

}
